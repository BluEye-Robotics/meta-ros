DESCRIPTION = "Parser for Semantic Robot Description Format"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules boost urdf urdfdom-py console-bridge libtinyxml urdfdom-headers"

SRC_URI = "https://github.com/ros-planning/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "12960837d6f9afbf65af33d28cb3dd38"
SRC_URI[sha256sum] = "98d585667906da2485dfad67af3ee5df4caab9a5cd9faf5e794c06357a87a9cf"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin

ROS_SPN = "srdfdom"
