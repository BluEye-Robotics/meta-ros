DESCRIPTION = "Controller for a steer drive mobile base."
AUTHOR = "Masaru Morita"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "pluginlib urdf boost controller-interface diff-drive-controller hardware-interface nav-msgs realtime-tools roscpp tf"

RDEPENDS_${PN} = "pluginlib urdf"

SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/melodic/ackermann_steering_controller/0.14.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "407dccf653fc04d627fe4a9b9a91e320"
SRC_URI[sha256sum] = "6725456d97d8720b60b8abf1588f25f0117857705c1add9f13a8efe668dda925"

ROS_SPN = "ros_controllers"
S = "${WORKDIR}/ros_controllers-release-release-melodic-ackermann_steering_controller-0.14.3-0"

inherit catkin
