DESCRIPTION = "Provides wrappers around the yaml-cpp library for various utility functions and to abstract out the API changes made to yaml-cpp between ubuntu:precise and ubuntu:trusty."
AUTHOR = "Marc Alban"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost yaml-cpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_yaml_util/2.10.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "85bfb0fa1a71c7d6c6af6ba4f5c1f578"
SRC_URI[sha256sum] = "602668d72283398607bb10749469471315d086fcb28f34d63ad2572506ae1397"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_yaml_util-2.10.0-1"

inherit catkin
