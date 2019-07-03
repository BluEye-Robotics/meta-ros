DESCRIPTION = "Controller for a steer drive mobile base."
AUTHOR = "Masaru Morita"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "pluginlib urdf boost controller-interface diff-drive-controller hardware-interface nav-msgs realtime-tools roscpp tf"

RDEPENDS_${PN} = "pluginlib urdf"

SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/melodic/ackermann_steering_controller/0.15.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6de415dcc09a2bd3472a7e158cffe638"
SRC_URI[sha256sum] = "d6de33231e9dfdcb67a15c0c397f77d3e3e656823cabd02eb2464ba4a617b83a"

ROS_SPN = "ros_controllers"
S = "${WORKDIR}/ros_controllers-release-release-melodic-ackermann_steering_controller-0.15.0-0"

inherit catkin
