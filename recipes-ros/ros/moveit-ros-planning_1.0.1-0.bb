DESCRIPTION = "Planning components of MoveIt! that use ROS"
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libeigen moveit-core moveit-ros-perception moveit-msgs message-filters pluginlib actionlib dynamic-reconfigure rosconsole roscpp srdfdom urdf tf2 tf2-eigen tf2-geometry-msgs tf2-msgs tf2-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_ros_planning/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "73b88dbd6cff7ef6de516bf43294cd1a"
SRC_URI[sha256sum] = "88875fc4613ea154a28967c8402e847aac51cbec89a0a5afe32449f291b47d66"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_ros_planning-1.0.1-0"

inherit catkin
