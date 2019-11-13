DESCRIPTION = "The move_group node for MoveIt"
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib moveit-core moveit-ros-planning roscpp tf2 tf2-geometry-msgs tf2-ros pluginlib std-srvs"

RDEPENDS_${PN} = "moveit-kinematics"

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_ros_move_group/1.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9ee300f262ec11749325854979206765"
SRC_URI[sha256sum] = "d769750daaea1f09c9e550295c4b04c4fb609c3d514a6ae03f4a7c38c81ab515"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_ros_move_group-1.0.2-1"

inherit catkin
