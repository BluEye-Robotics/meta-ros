DESCRIPTION = "Combined Robot HW class."
AUTHOR = "Toni Oliver"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "hardware-interface pluginlib roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/melodic/combined_robot_hw/0.15.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d5f4c80ac2a16e57a68dc9e3872ec452"
SRC_URI[sha256sum] = "aa5ba158529df1e934c5e0589dfd2c7f8af8f51820c86eb806494cc1613e0d01"

ROS_SPN = "ros_control"
S = "${WORKDIR}/ros_control-release-release-melodic-combined_robot_hw-0.15.1-0"

inherit catkin
