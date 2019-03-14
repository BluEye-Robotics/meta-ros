DESCRIPTION = "swri_geometry_util"
AUTHOR = "Marc Alban"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules cv-bridge libeigen libgeos++-dev roscpp tf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_geometry_util/2.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c0f6dd0a14a49a679b5ae76ac4f85faa"
SRC_URI[sha256sum] = "a09570175b7e2453a78c973b2cdc11f93dacc5e0f2f33c7afa80dff66b05162d"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_geometry_util-2.8.0-0"

inherit catkin
