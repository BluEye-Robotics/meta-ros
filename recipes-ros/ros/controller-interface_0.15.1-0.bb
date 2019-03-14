DESCRIPTION = "Interface base class for controllers"
AUTHOR = "Wim Meeussen"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "hardware-interface pluginlib roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/melodic/controller_interface/0.15.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cb22187211735aa04d8bda03883e7554"
SRC_URI[sha256sum] = "6b4025c033f2785cdbf9c8246c7699e597de302f0651fd94e64d3b7746786350"

ROS_SPN = "ros_control"
S = "${WORKDIR}/ros_control-release-release-melodic-controller_interface-0.15.1-0"

inherit catkin
