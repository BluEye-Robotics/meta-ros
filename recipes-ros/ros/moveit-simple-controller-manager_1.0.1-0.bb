DESCRIPTION = "A generic, simple controller manager plugin for MoveIt."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "moveit-core roscpp pluginlib control-msgs actionlib"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_simple_controller_manager/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6e56d16e66c2b246b6f924821700d8d5"
SRC_URI[sha256sum] = "911f5903df3144ae4ae248752b196acb700a83536c1662fd4b0005badf1d7eee"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_simple_controller_manager-1.0.1-0"

inherit catkin
