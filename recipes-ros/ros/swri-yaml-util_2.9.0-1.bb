DESCRIPTION = "Provides wrappers around the yaml-cpp library for various utility functions and to abstract out the API changes made to yaml-cpp between ubuntu:precise and ubuntu:trusty."
AUTHOR = "Marc Alban"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost yaml-cpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_yaml_util/2.9.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f63cc7c408cae5c44bcfefe9ca688fa4"
SRC_URI[sha256sum] = "a4c86c48436a1d03f0451fd5fe8e83ae1c770bfc1284459d9e90c98cfa294d85"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_yaml_util-2.9.0-1"

inherit catkin
