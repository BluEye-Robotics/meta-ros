#!/usr/bin/env python3

# Copyright (c) 2017, Blueye Robotics AS
#
# check-version.py is free software: you can redistribute it and/or modify
# it under the terms of the GNU General Public License as published by
# the Free Software Foundation, either version 3 of the License, or
# (at your option) any later version.
#
# check-version.py is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
# GNU General Public License for more details.
#
# See <https://www.gnu.org/licenses/gpl-3.0.html> for full license text.

import os
import urllib.request
import sys
import re
import hashlib
from distutils.version import LooseVersion
import yaml

__author__ = "Johannes Schrimpf"
__copyright__ = "Copyright 2017, Blueye Robotics AS"
__credits__ = ["Johannes Schrimpf"]
__license__ = "GPLv3"

BASE_DIR = "../recipes-ros"
DEBUG = False
EXCLUDE = ["packagegroups"]


class MoveRepoExcetion(Exception):
    pass


class DistroUrlException(Exception):
    pass


class Distribution:
    data = None

    @staticmethod
    def get_version(package):
        if Distribution.data is None:
            Distribution.data = yaml.load(urllib.request.urlopen(DIST_FILE).read())
        package = package.replace("-", "_")
        return Distribution.data["repositories"][package]["release"]["version"]

    @staticmethod
    def get_url(package):
        if Distribution.data is None:
            Distribution.data = yaml.load(urllib.request.urlopen(DIST_FILE).read())
        package = package.replace("-", "_")
        try:
            base = Distribution.data["repositories"][package]["release"]["url"].split(".git")[0]
            path = Distribution.data["repositories"][package]["release"]["tags"]["release"]
            url = base + "/archive/" + path + ".tar.gz"
            url = url.replace("{version}", "${PV}")
            url = url.replace("{package}", "${ROS_BPN}")
            return url
        except KeyError:
            raise DistroUrlException()


class RecipeDir:
    def __init__(self, package):
        self._package = package
        self._inc_fn = None
        package_dir = os.path.join(BASE_DIR, self._package)

        if os.path.isfile(os.path.join(package_dir, self._package + ".inc")):
            self._inc_fn = os.path.join(package_dir, self._package + ".inc")
        versions = set()
        version = None
        self._files = [f for f in os.listdir(package_dir) if f.endswith(".bb")]
        self._sub_recepies = [f.split("_")[0] for f in self._files]
        for filename in self._files:
            version = filename.split("_")[1].split(".bb")[0]
            versions.update([version])

        if len(versions) > 1:
            print("Package: %s" % package)
            print(versions)
            raise Exception("Multiple versions per package not supported at this time")

        if version is None:
            version = "n.a."

        self._version = version

        """
        if len(files) > 1:
            print("Package: %s" % self._package)
            raise Exception("Multiple versions per package not supported at this time")
        elif len(files) == 0:
            self._bb_fn = None
            self._version = ""
        else:
            self._bb_fn = os.path.join(package_dir, files[0])
            self._version = version"""


    def get_version(self, details=False):
        return self._version

    def check_version(self, print_info="none", details=False):
        try:
            dist_ver = Distribution.get_version(self._package)
        except KeyError:
            dist_ver = ""

        version = self.get_version(details)

        match = dist_ver == version

        if print_info == "all" or print_info == "mismatch" and not match:
            if dist_ver == "" or version == "":
                pre = post = ""
                mid = "   "
            elif version == "git":
                mid = "   "
                pre = post = ""
            else:
                pre = '\033[92m' if match else '\033[91m'
                post = '\033[0m'
                if match:
                    mid = " = "
                else:
                    assert LooseVersion(version) != LooseVersion(dist_ver)
                    if LooseVersion(version) > LooseVersion(dist_ver):
                        mid = " > "
                    elif LooseVersion(dist_ver) > LooseVersion(version):
                        mid = " < "
            print(self._package.ljust(35) + pre + version.ljust(10) + mid + dist_ver.ljust(10) + post)
            if details:
                for subrec in self._sub_recepies:
                    print(" - " + subrec)
        return match, version, dist_ver


    def update_to_distro(self):
        print_debug("Updating %s" % self._package)
        print_header()
        match, version, dist_version = self.check_version(print_info="all", details=True)
        if match:
            print("Packet is already in newest version")
            return
        if dist_version == "":
            print("Packet not found in dist file")
            return

        if version == "git":
            print("Layer uses git version. Please update manually")
            return
        elif LooseVersion(version) > LooseVersion(dist_version) and "--downgrade" not in sys.argv:
            print("Layer version is newer than dist version, " +
                  "use --downgrade as last argument to downgrade")
            return

        try:
            path = os.path.join(BASE_DIR, self._package)

            update_include = False
            rename_requests = []
            for recipe in (os.path.join(path, fn) for fn in os.listdir(path) if fn.endswith(".bb")):
                with open(recipe) as recipe_file:
                    data = recipe_file.read()

                old_fn = os.path.join(recipe)
                new_fn = os.path.join(recipe.replace(version, dist_version))
                rename_requests.append([old_fn, new_fn])

                if "SRC_URI[md5sum]" not in data and "SRC_URI[sha256sum]" not in data:
                    update_include = True
                else:
                    self.update_checksums_in_file(old_fn, dist_version)

            if update_include:
                self.update_checksums_in_file(self._inc_fn, dist_version)
        except MoveRepoExcetion:
            print_err("Repo moved %s" % self._package)
        except DistroUrlException:
            print_err("Cannot retrieve source url for %s" % self._package)
        except urllib.error.HTTPError as e:
            print_err(str(e))
        else:
            print_debug("Renaming files for %s" % self._package)
            for [old_fn, new_fn] in rename_requests:
                print_debug("old: %s" % old_fn)
                print_debug("new: %s" % new_fn)
                os.rename(old_fn, new_fn)
            print_ok("Updated")


    def update_checksums_in_file(self, filename, dist_version):
        with open(filename) as recipe_file:
            recipe_data = recipe_file.read()

        ros_pv = dist_version
        ros_spn = self._package.replace('-', '_')
        ros_bpn = self._package.replace('-', '_')
        ros_sp = "%s-%s" % (ros_spn, ros_pv)

        url = re.search(r'SRC_URI\s*=\s*"(\S*)\s*["\\]', recipe_data).group(1)
        url_full = re.search(r'SRC_URI\s*=\s*"(\S*\s*)["\\]', recipe_data).group(1)
        url = url.split(";")[0]

        if "protocol=git" in url:
            print_err("Using git protocol. Please update manually.")


        url_abs = url.replace("${ROS_SPN}", ros_spn)
        url_abs = url.replace("${ROS_BPN}", ros_bpn)
        url_abs = url_abs.replace("${ROS_SP}", ros_sp)
        url_abs = url_abs.replace("${PV}", ros_pv)

        repo = Distribution.get_url(self._package)
        repo_abs = repo.replace("${ROS_SPN}", ros_spn)
        repo_abs = repo.replace("${ROS_BPN}", ros_bpn)
        repo_abs = repo_abs.replace("${ROS_SP}", ros_sp)
        repo_abs = repo_abs.replace("${PV}", ros_pv)

        if repo not in url:
            print("recipe: %s" % url)
            print("repo:   %s" % repo)
            #raise MoveRepoExcetion()
            print("Update repo url")
            recipe_data = recipe_data.replace(url_full, '%s;downloadfilename=${ROS_BPN}-${PV}.tar.gz' % repo)
            url_abs = repo_abs

        try:
            md5sum = re.search(r'SRC_URI\[md5sum\]\s*=\s*"(\S*)"', recipe_data).group(1)
        except AttributeError:
            print_err("Error reading md5sum in package %s. Please update manually." % self._package)
            return False
        try:
            sha256sum = re.search(r'SRC_URI\[sha256sum\]\s*=\s*"(\S*)"', recipe_data).group(1)
        except AttributeError:
            print_err("Error reading sha256sum in package %s. Please update manually." % self._package)
            return False

        if len(md5sum) != 32 and len(sha256sum) != 64:
            print_err("Failed reading checksums.")
            return False
        md5sum_new, sha256sum_new = get_checksums_from_url(url_abs)
        print_debug("Updating checksums in file %s" % filename)
        print_debug("old md5: %s" % md5sum)
        print_debug("new md5: %s" % md5sum_new)
        print_debug("old sha256: %s" % sha256sum)
        print_debug("new sha256: %s" % sha256sum_new)
        recipe_data = recipe_data.replace(md5sum, md5sum_new)
        recipe_data = recipe_data.replace(sha256sum, sha256sum_new)
        with open(filename, 'w') as recipe_file:
            recipe_file.write(recipe_data)
        return True


class Layer:
    @staticmethod
    def get_version(package, details=False):
        return RecipeDir(package).get_version(details)

    @staticmethod
    def get_recipe(package, details=False):
        return RecipeDir(package)

    @staticmethod
    def get_package_list():
        return (x for x in sorted(os.listdir(BASE_DIR)) if x not in EXCLUDE and os.path.isdir(os.path.join(BASE_DIR, x)))

    @staticmethod
    def get_recipe_list():
        return (RecipeDir(p) for p in Layer.get_package_list())

    @staticmethod
    def print_list(details=False):
        print_header()
        for recipe in Layer.get_recipe_list():
            recipe.check_version(details=details, print_info="all")

    @staticmethod
    def update_all_packages():
        for recipe in (r for r in Layer.get_recipe_list() if not r.check_version()[0]):
            recipe.update_to_distro()

    def print_mismatch(details=False):
        print_header()
        for recipe in (r for r in Layer.get_recipe_list()):
            recipe.check_version(details=details, print_info="mismatch")


def print_debug(text):
    if DEBUG:
        print(text)


def print_err(text):
    pre = '\033[91m'
    post = '\033[0m'
    print(pre + text + post)


def print_ok(text):
    pre = '\033[92m'
    post = '\033[0m'
    print(pre + text + post)


def get_checksums_from_url(url):
    print(url)
    data = urllib.request.urlopen(url).read()
    md5sum = hashlib.md5()
    md5sum.update(data)
    md5sum_hex = md5sum.hexdigest()
    sha256sum = hashlib.sha256()
    sha256sum.update(data)
    sha256sum_hex = sha256sum.hexdigest()
    return md5sum_hex, sha256sum_hex


def print_header():
    print("\033[1m\033[4m" + "package".ljust(35) + "layer".ljust(13) +
          "distro".ljust(10) + '\033[0m')


def print_help():
    filename = sys.argv[0]
    print("Usage:")
    print("List all versions:                  %s list (--details)" % filename)
    print("List all versions that don't match: %s mismatch (--details)" % filename)
    print("Update recipe to dist version:      %s update <package> (--downgrade)" % filename)
    print("Update all recipes to dist version: %s update-all (--downgrade)" % filename)


if __name__ == "__main__":
    with open("../conf/layer.conf") as layerfile:
        DISTRO = re.search(r'ROSDISTRO\s:=\s*"(\S*)\s*["\\]', layerfile.read()).group(1)
    DIST_FILE = "https://raw.githubusercontent.com/ros/rosdistro/master/" +\
                DISTRO + "/distribution.yaml"
    if len(sys.argv) == 1:
        print_help()
    else:
        if sys.argv[1] == "list":
            Layer.print_list(details="--details" in sys.argv)
        elif sys.argv[1] == "mismatch":
            Layer.print_mismatch(details="--details" in sys.argv)
        elif sys.argv[1] == "update" and len(sys.argv) >= 3:
            Layer.get_recipe(sys.argv[2]).update_to_distro()
        elif sys.argv[1] == "update-all":
            Layer.update_all_packages()
        else:
            print_help()
