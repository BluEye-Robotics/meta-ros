DESCRIPTION = "Some utility functionality to interact with ROS using roslisp."
AUTHOR = "Lorenz Moesenlechner"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/roslisp_common-release/archive/release/melodic/roslisp_utilities/0.2.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0f966bc3c85336150fc31035d5d62a18"
SRC_URI[sha256sum] = "8ba55d5f2be13e9efc3be9f7ab4d78897f917e388d291f75f627642034621103"

ROS_SPN = "roslisp_common"
S = "${WORKDIR}/roslisp_common-release-release-melodic-roslisp_utilities-0.2.10-0"

inherit catkin
