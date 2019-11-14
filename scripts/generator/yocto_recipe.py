import re
import hashlib
import urllib
import tarfile
import os
from utils import get_checksums_from_url, print_err

from lxml import etree

'''
"BSD": "d566ef916e9dedc494f5f793a6690ba5",
"CC-BY-NC-SA-2.0": "11e24f757f025b2cbebd5b14b4a7ca19",
"LGPL-2.1": "184dd1523b9a109aead3fbbe0b4262e0",
"GPL": "162b49cfbae9eadf37c9b89b2d2ac6be",
"LGPL-2.1+": "58d727014cda5ed405b7fb52666a1f97",
"LGPLv2": "46ee8693f40a89a31023e97ae17ecf19",
"MIT": "58e54c03ca7f821dd3967e2a2cd1596e",
"Mozilla Public License Version 1.1": "e1b5a50d4dd59d8102e41a7a2254462d",
'''

LICENSES = {
    "BSD": "BSD",
    "GPLv2": "GPL-2.0",
    "GPLv3": "GPL-3.0",
    "LGPL-2.1": "LGPL-2.1",
    "LGPLv2": "LGPL-2.0",
    "LGPL3": "LGPL-3.0",
    "LGPLv3": "LGPL-3.0",
    "MIT": "MIT",
    "Mozilla Public License Version 1.1": "MPL-1.1",
    "Apache2": "Apache-2.0",
    "BSD2": "BSD-2-Clause",
    "3-Clause BSD": "BSD-3-Clause",
    "Apache-2.0": "Apache-2.0",
    "Apache License 2.0": "Apache-2.0",
    "Apache 2.0": "Apache-2.0",
    "Apache License, Version 2.0": "Apache-2.0",
    "APLv2": "Apache-2.0",
    "ASL 2.0": "Apache-2.0",
    "ALv2": "Apache-2.0",
    "CC-BY-NC-SA-2.0": "CC-BY-NC-SA-2.0",
    "ECL2.0": "ECL-2.0",
    "NASA-1.3": "NASA-1.3",
    "Public domain": "PD",
    "Public Domain": "PD",
    "Creative Commons BY-NC-ND 3.0": "CC-BY-NC-ND-3.0",
    "Proprietary": "Proprietary",
    "Boost Software License, Version 1.0": "BSL-1.0",
    "BSL1.0": "BSL-1.0",
    "CC BY-NC-SA 4.0": "CC-BY-NC-SA-4.0",
    "CreativeCommons-Attribution-NonCommercial-NoDerivatives-4.0": "CC-BY-NC-ND-4.0",
    "LGPL": "LGPL",
    "GPL": "GPL",
}

LICENSES2 = {
    "N/A": "NA",
    "LGPL-2.1+": "LGPL-2.1+",
    "EPL": "EPL",
    "Apache": "Apache",
    "GPL+linking exception": "GPL+linking",
    "GNU Lesser General Public License (LGPL)": "LGPL",
    "BSD, Apache 2.0": "",
    "BSD,LGPL,Apache 2.0": "",
    "BSD, LGPL": "",
    "United States Government Purpose": "",
    "BSD, some icons are licensed under the GNU Lesser General Public License (LGPL) or Creative Commons Attribution-Noncommercial 3.0 License": "",
    "BSD,LGPL,LGPL (amcl)": "",
    "Southwest Research Institute Proprietary": "",
    "HEBI C++ Software License (https://www.hebirobotics.com/softwarelicense)": "",
    "HOYA License": "",
    "Yujin Robot": "",
    "TODO": "",
    "BSD, GPL": "",
    "Binary Only": "",
}

DEP_RENAME_BUILD = {
    "python-argparse": "",
    "python-bson": "python-pymongo"
}

DEP_RENAME = {
    "pkg-config": "pkgconfig",
    "tinyxml": "libtinyxml",
    "tinyxml2": "libtinyxml2",
    "libconsole-bridge-dev": "console-bridge",
    "python-wxtools": "",
    "python-yaml": "python-pyyaml",
    "python3-yaml": "python3-pyyaml",
    "google-mock": "gmock",
    "eigen": "libeigen",
    "roslisp": "",
    "uuid": "",
    "libqhull": "qhull",
    "arduino-core": "",
    "graphviz": "",
    "netpbm": "",
    "glut": "",
    "rviz": "",
    "opengl": "",
    "joystick": "",
    "python-sip": "sip",
    "python-backports.ssl-match-hostname": "",
    "libfcl-dev": "fcl",
    "geographiclib-tools": "geographiclib",
    "libglew-dev": "",
    "sdl": "libsdl-image",
    "python-opencv": "",
    "python-serial": "python-pyserial",
    "liburdfdom-dev": "urdfdom",
    "liburdfdom-headers-dev": "urdfdom-headers",
    "sdl-image": "libsdl-image",
    "libpcl-all-dev": "pcl",
    "linux-kernel-headers": "virtual/kernel",
    "libgstreamer-plugins-base1.0-dev": "gstreamer1.0-plugins-base",
    "libgstreamer1.0-dev": "gstreamer1.0",
    "assimp-dev": "assimp",
    "libopencv-dev": "opencv",
    "python-qt-binding-dev": "python-pyqt5",
    "python-qt-binding": "python-pyqt5",
    "libpoco-dev": "poco",
    "libssl-dev": "openssl",
    "libgpgme-dev": "gpgme",
    "python-crypto": "python-pycrypto",
}


#"libqt5-gui": "qtbase",
#"qtbase5-dev": "qtbase",
#"libqt5-core": "qtbase",
#"qt5-qmake": "qtbase",

BLACKLIST = ["libqt5-gui", "qtbase5-dev", "libqt5-core", "qt5-cmake", "python-qt5-bindings"]


#"libconsole-bridge": "console-bridge",
#"libconsole-bridge-dev": "console-bridge-dev",


def correct(string):
    return re.sub(r'\.(?! )', '. ', re.sub(r' +', ' ',
                                           re.sub(r'\n', '', string)))

class XmlParser:
    def __init__(self, name, data):
        self.name = name
        self.data = data.decode("utf-8")
        self.tree = etree.fromstring(data)

    def getName(self):
        return self.tree.xpath("/package/name")[0].text

    def getVersion(self):
        return self.tree.xpath("/package/version")[0].text

    # Sometimes the description has
    def getDescription(self):
        try:
            return correct(
                self.tree.xpath("/package/description")[0].text).lstrip(' ')
        except TypeError:
            # Fix for geometry
            return correct(
                self.tree.xpath("/package/description/p")[0].text).lstrip(' ')

    def getAuthorName(self):
        try:
            return self.tree.xpath("/package/author")[0].text.strip().replace("\n","_")
        except IndexError:
            #print("Author name not found")
            return ""

    def getLicense(self):
        lic = str(self.tree.xpath("/package/license")[0].text)
        if lic not in LICENSES.keys():
            print_err("Unknown license: %s - %s" % (self.name, lic))
            raise Exception("Unknown license")
        return LICENSES[lic]


    def getDependencies(self):
        dependencies = []
        # Support both xml version 1 and 2
        # Reason run_depend is added is that in version 1 build_export_depend is not available yet,
        # so for example message generation needs to add run_depends to build_depends
        recipe_depends = self.tree.xpath("/package/build_depend") + self.tree.xpath("/package/depend") +\
                         self.tree.xpath("/package/build_export_depend") + self.tree.xpath("/package/run_depend")
        for dependency in recipe_depends:
            dep = dependency.text.replace("_", "-") #.replace("-dev", "")
            if dep in DEP_RENAME_BUILD.keys():
                dep = DEP_RENAME_BUILD[dep]
            if dep in DEP_RENAME.keys():
                dep = DEP_RENAME[dep]
            if dep in BLACKLIST:
                print_err("Depencency blacklisted for %s: %s" % (self.name, dep))
                raise Exception("dep blacklisted")
            if not "python3" in dep:
                dependencies.append(dep)
        return dependencies

    def getRuntimeDependencies(self):
        dependencies = []
        recipe_depends = self.tree.xpath("/package/exec_depend") + self.tree.xpath("/package/run_depend")
        for dependency in recipe_depends:
            dep = dependency.text.replace("_", "-") #.replace("-dev", "")
            if dep in DEP_RENAME.keys():
                dep = DEP_RENAME[dep]
            if dep in BLACKLIST:
                print_err("Depencency blacklisted for %s: %s" % (self.name, dep))
                raise Exception("dep blacklisted")
            if not "python3" in dep:
                dependencies.append(dep)
        return dependencies

    def getLicenseLineNumber(self):
        for num, line in enumerate(self.data.split("\n"), 1):
            if 'license' in line:
                return num
        return 'CLOSED'

    def getLicenseLineMD5(self):
        for num, line in enumerate(self.data.split("\n"), 1):
            if '<license>' in line:
                return hashlib.md5((line+"\n").encode("utf-8")).hexdigest()
        print_err("Did not find license line")
        raise Exception()


class YoctoRecipe:

    def __init__(self, url, name, version, repo):
        self.repo = repo
        self.name = name
        self.repository = None
        self.version = version
        self.description = None
        self.url = url
        self.author = None
        self.license = None
        self.dependencies = None
        self.runtimedependencies = None
        self.license_line = None
        self.license_md5 = None
        self.src_md5 = None
        self.src_sha256 = None
        self.tar_prefix = ""

    def getSrcMD5(self):
        return hashlib.md5(
            open(self.getArchive(), 'rb').read()).hexdigest()

    def getSrcSha256(self):
        return hashlib.sha256(
            open(self.getArchive(), 'rb').read()).hexdigest()

    def importXML(self):
        url = self.url.replace("/archive/", "/")
        url = url.replace("github.com", "raw.githubusercontent.com")
        url = url.replace(".tar.gz", "/package.xml")
        #print("Download package.xml from %s" % url)
        #try:
        #    xmldata = urllib.request.urlopen(url).read()
        #except urllib.error.HTTPError:
        if True:
            repo = self.repo.replace("-", "_")
            name = self.name.replace("-", "_")
            pbase = "%s-release-release-melodic-%s" % (repo, name)
            pbase_v = "%s-release-release-melodic-%s-%s" % (repo, name, self.version)
            #print("Download and analyze %s" % self.url)
            #import tarfile, io
            fn = self.getArchive()
            #file_data = urllib.request.urlopen(self.url).read()
            #file_like_object = io.BytesIO(file_data)
            #tar = tarfile.open(fileobj=file_like_object)
            tar = tarfile.open(fn)
            tar_fns = tar.getnames()
            if "package.xml" in tar_fns:
                self.tar_prefix = ""
            elif pbase + "/package.xml" in tar_fns:
                self.tar_prefix = pbase
            elif pbase_v + "/package.xml" in tar_fns:
                self.tar_prefix = pbase_v
            else:
                prefix_paths = set()
                for fn in tar_fns:
                    prefix_paths.add(fn.split("/")[0])
                if len(prefix_paths) == 1:
                    self.tar_prefix = prefix_paths.pop()
                else:
                    raise Exception("No usual path", pbase, pbase_v,  tar_fns)
            xmlpath = os.path.join(self.tar_prefix, "package.xml")
            xmldata = tar.extractfile(xmlpath).read()

        xml = XmlParser(self.name, xmldata)
        self.description = xml.getDescription()
        self.author = xml.getAuthorName()
        self.license = xml.getLicense()
        self.dependencies = xml.getDependencies()
        self.runtimedependencies = xml.getRuntimeDependencies()
        self.license_line = xml.getLicenseLineNumber()
        self.license_md5 = xml.getLicenseLineMD5()

    def getURL(self):
        return self.url

    def getFolderName(self):
        return self.name.replace("-", "_") + "-" + str(self.version)

    def getArchiveName(self):
        return self.name.replace("-", "_") + \
               "-" + str(self.version) + \
               ".tar.gz"

    # To debug
    def printXML(self):
        print(self.name)
        print(self.version)
        print(self.description)
        print(self.author)
        print(self.license)
        print(self.dependencies)
        print(self.runtimedependencies)

    def parseDependencies(self):
        dependencies_ = 'DEPENDS = \"'
        for f in self.dependencies:
            dependencies_ = dependencies_ + f + " "
        dependencies_ = dependencies_.rstrip() + "\""
        return dependencies_ + "\n"

    def parseRuntimeDependencies(self):
        dependencies_ = 'RDEPENDS_${PN} = \"'
        for f in self.runtimedependencies:
            dependencies_ = dependencies_ + f + " "
        dependencies_ = dependencies_.rstrip() + "\""
        return dependencies_ + "\n"

    def downloadArchive(self):
        print("Downloading %s" % self.url)
        fn = os.path.join("downloads", self.getArchiveName())
        urllib.request.urlretrieve(self.url, fn)

    def getArchive(self):
        fn = os.path.join("downloads", self.getArchiveName())
        if os.path.isfile(fn):
            return fn
        self.downloadArchive()
        return fn

    def extractArchive(self):
        tar = tarfile.open(self.getArchiveName(), "r:gz")
        tar.extractall()
        tar.close()

    def createRecipe(self, dir):
        #md5, sha256 = get_checksums_from_url(self.url)
        filename = self.name.replace("_", "-") + "_" + self.version + ".bb"
        print("Recipe generated:" + filename)

        recipe = 'DESCRIPTION = "%s"\n' % self.description.rstrip()
        recipe += 'AUTHOR = "%s"\n' % self.author
        recipe += 'SECTION = "devel"\n'
        recipe += 'LICENSE = "%s"\n' % self.license
        recipe += 'LIC_FILES_CHKSUM = "file://package.xml;beginline=%d;endline=%d;md5=%s"\n' % \
                    (self.license_line, self.license_line, self.license_md5)
        recipe += '\n'
        recipe += self.parseDependencies() + "\n"
        recipe += self.parseRuntimeDependencies() + "\n"
        recipe += 'SRC_URI = "%s;downloadfilename=${ROS_BPN}-${PV}.tar.gz"\n' % self.url
        recipe += 'SRC_URI[md5sum] = "%s"\n' % self.getSrcMD5()
        recipe += 'SRC_URI[sha256sum] = "%s"\n' % self.getSrcSha256()
        recipe += '\n'
        if self.repo != self.name:
            recipe += 'ROS_SPN = "%s"\n' % self.repo
        recipe += 'S = "${WORKDIR}/%s"\n' % self.tar_prefix
        recipe += '\n'
        recipe += 'inherit catkin\n'

        with open(os.path.join(dir, self.name.replace("_", "-") +
                                 "_" + self.version + ".bb"), "w") as file:
            file.write(recipe)
