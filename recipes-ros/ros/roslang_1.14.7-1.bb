DESCRIPTION = "roslang is a common package that all"
AUTHOR = "Brian Gerkey"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin genmsg"

RDEPENDS_${PN} = "catkin genmsg"

SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/melodic/roslang/1.14.7-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "64e264f5f6cd7f6266162d9507c39eb3"
SRC_URI[sha256sum] = "2fa4021768ecf136c9203100fd0537787e06e05af215bf5f17e0fb5740e7cb90"

ROS_SPN = "ros"
S = "${WORKDIR}/ros-release-release-melodic-roslang-1.14.7-1"

inherit catkin
