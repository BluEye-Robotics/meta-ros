DESCRIPTION = "Components of MoveIt! used for manipulation"
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libeigen actionlib dynamic-reconfigure moveit-core moveit-ros-move-group moveit-ros-planning moveit-msgs roscpp rosconsole tf2-eigen pluginlib"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_ros_manipulation/1.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "48edcd1feb92969819464aff7594b3d9"
SRC_URI[sha256sum] = "156ae51dac52174c5702fd6c73088fe6b3cb36da1a202e8eddb5a4b02e843b51"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_ros_manipulation-1.0.2-1"

inherit catkin
