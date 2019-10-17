DESCRIPTION = "Planning components of MoveIt! that use ROS"
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libeigen moveit-core moveit-ros-perception moveit-msgs message-filters pluginlib actionlib dynamic-reconfigure rosconsole roscpp srdfdom urdf tf2 tf2-eigen tf2-geometry-msgs tf2-msgs tf2-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_ros_planning/1.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c103bc1e3a8fda513201dbfaba8e2cd1"
SRC_URI[sha256sum] = "c3b8fc441f13cfac3da59cf186ac92f8c8b60449bccc9ae029b01e8a1f2c9871"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_ros_planning-1.0.2-1"

inherit catkin
