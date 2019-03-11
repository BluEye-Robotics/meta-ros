DESCRIPTION = "The move_group node for MoveIt"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "moveit-core moveit-ros-planning std-srvs"

require moveit.inc

SRC_URI += "file://0001-remove-deprecated-and-unused-boost-signals.patch;striplevel=3"

ROS_BPN = "moveit_ros/move_group"

RDEPENDS_${PN} += "moveit-kinematics"

FILES_${PN} += "${ros_libdir}/moveit_ros_move_group/*"
