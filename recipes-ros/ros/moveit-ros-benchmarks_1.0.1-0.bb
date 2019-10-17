DESCRIPTION = "Enhanced tools for benchmarks in MoveIt!"
AUTHOR = "Ryan Luna"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "moveit-ros-planning moveit-ros-warehouse roscpp tf2-eigen pluginlib"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_ros_benchmarks/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "729d717a8923a1705f29dc1549d63b5a"
SRC_URI[sha256sum] = "3168565928ff160fe763f5c06a80f70ef3dd4be70cf043eedc35ef1aefc05e4e"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_ros_benchmarks-1.0.1-0"

inherit catkin
