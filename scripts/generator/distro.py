#!/usr/bin/env python3

import yaml
import urllib.request
import re
from utils import *
from yocto_recipe import YoctoRecipe
from multiprocessing.pool import ThreadPool
from concurrent.futures import ThreadPoolExecutor

with open("../../conf/layer.conf") as layerfile:
    DISTRO = re.search(r'ROSDISTRO\s:=\s*"(\S*)\s*["\\]', layerfile.read()).group(1)
DIST_FILE = "https://raw.githubusercontent.com/ros/rosdistro/master/" + \
            DISTRO + "/distribution.yaml"


class DistroUrlException(Exception):
    pass

manual_overrides = {
    'message_generation': ["melodic", "kinetic"]
}

class Distribution:
    data = None

    @staticmethod
    def _load_dist_file():
        if Distribution.data is None:
            Distribution.data = yaml.load(urllib.request.urlopen(DIST_FILE).read())

    @staticmethod
    def get_version(pn):
        Distribution._load_dist_file()
        #pn = pn.replace("-", "_")
        return Distribution.get_repo_data(pn)["release"]["version"]

    @staticmethod
    def get_repo_data(pn):
        #print("P: '%s'" %pn)
        if pn in Distribution.data["repositories"]:
            return Distribution.data["repositories"][pn]
        for repo in Distribution.data["repositories"]:
            try:
                if pn in Distribution.data["repositories"][repo]["release"]["packages"]:
                    return Distribution.data["repositories"][repo]
            except KeyError:
                pass
        raise Exception("Package not found")

    @staticmethod
    def get_repo(pn):
        if pn in Distribution.data["repositories"]:
            return pn
        for repo in Distribution.data["repositories"]:
            try:
                if pn in Distribution.data["repositories"][repo]["release"]["packages"]:
                    return repo
            except KeyError:
                pass
        raise Exception("Package not found")

    @staticmethod
    def get_url(pn):
        data = Distribution.get_repo_data(pn)
        pn = pn.replace("-", "_")
        try:
            base = data["release"]["url"].split(".git")[0]
            path = data["release"]["tags"]["release"]
            url = base + "/archive/" + path + ".tar.gz"
            url = url.replace("{version}", "${PV}")
            url = url.replace("{package}", "${ROS_BPN}")
            if pn in manual_overrides.keys():
                url = url.replace(manual_overrides[pn][0], manual_overrides[pn][1])
            return url
        except KeyError:
            raise DistroUrlException()

    @staticmethod
    def get_url_abs(pn):
        version = Distribution.get_version(pn)
        url = Distribution.get_url(pn)
        url = url.replace("${PV}", version)
        url = url.replace("${ROS_BPN}", pn)
        return url


    @staticmethod
    def print_packages():
        Distribution._load_dist_file()
        for repo in Distribution.data["repositories"]:
            if not "release" in Distribution.data["repositories"][repo]:
                print_err(repo)
                continue
            print(repo)
            if "packages" in Distribution.data["repositories"][repo]["release"]:
                for p in Distribution.data["repositories"][repo]["release"]["packages"]:
                    print(" - ", p)

    @staticmethod
    def gen_packages():
        executor = ThreadPoolExecutor(max_workers=50)
        print("=== Generate packages ===")
        Distribution._load_dist_file()
        for repo in Distribution.data["repositories"]:
            if not "release" in Distribution.data["repositories"][repo]:
                print_err(repo)
                continue
            #print("=======")
            #print(repo)
            if "packages" in Distribution.data["repositories"][repo]["release"]:
                for p in Distribution.data["repositories"][repo]["release"]["packages"]:
                    #print("-----")
                    #print(" - ", p)
                    executor.submit(Distribution.get_recipe, p)
            else:
                #Distribution.get_recipe(repo)
                executor.submit(Distribution.get_recipe, repo)

    @staticmethod
    def get_recipe(pn):
        Distribution._load_dist_file()
        try:
            version = Distribution.get_version(pn)
            url = Distribution.get_url_abs(pn)
            repo = Distribution.get_repo(pn)
        except KeyError:
            print_err("Error in dist file")
            return
        #print(url)
        #print("=======")
        import os
        DIR = "../../recipes-ros/ros"
        if os.path.isfile(os.path.join(DIR, "%s_%s.bb"% (pn.replace("_", "-"), version))):
            #print("Skipping %s" % pn)
            return
        yr = YoctoRecipe(url, pn, version, repo)
        try:
            yr.importXML()
        except urllib.error.HTTPError:
            print_err("Could not download xml file")
        else:
            #yr.printXML()
            yr.createRecipe(DIR)




if __name__ == "__main__":
    #for p in Distribution.get_packages():
    #    print(p)
    #Distribution.print_packages()
    import sys
    if len(sys.argv) == 2:
        Distribution.get_recipe(sys.argv[1])
    else:
        Distribution.gen_packages()
    #Distribution.get_recipe("rosbridge_server")






