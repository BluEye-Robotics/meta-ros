DESCRIPTION = "A fast and flexible implementation of Rigid Body Dynamics algorithms and their analytical derivatives - wrapped for catkin."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "git python python-numpy urdfdom libeigen boost eigenpy"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipab-slmc/pinocchio_catkin-release/archive/release/melodic/pinocchio/2.1.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8334296d85230feb71009ea802679a07"
SRC_URI[sha256sum] = "55e2abcacc5f041bb5aac36853a0114852d76d03bdbe29c5a257f39429360fc6"

S = "${WORKDIR}/pinocchio_catkin-release-release-melodic-pinocchio-2.1.3-1"

inherit catkin
