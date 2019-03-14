DESCRIPTION = "Provides wrappers around the yaml-cpp library for various utility functions and to abstract out the API changes made to yaml-cpp between ubuntu:precise and ubuntu:trusty."
AUTHOR = "Marc Alban"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost yaml-cpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_yaml_util/2.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3d015b740faeee100f7abe7b91d3d0a6"
SRC_URI[sha256sum] = "db4f0e449531840ce1c70f259aaaf2afc0908a2d5a48dc6eb11a9095c3442d64"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_yaml_util-2.8.0-0"

inherit catkin
