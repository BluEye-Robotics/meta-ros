DESCRIPTION = "Generic framework for robot controls."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib pluginlib robot-controllers-msgs roscpp actionlib pluginlib robot-controllers-msgs roscpp"

RDEPENDS_${PN} = "actionlib pluginlib robot-controllers-msgs roscpp"

SRC_URI = "https://github.com/fetchrobotics-gbp/robot_controllers-release/archive/release/melodic/robot_controllers_interface/0.6.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "dca7cd1108be6e550a57caeba1e066a9"
SRC_URI[sha256sum] = "e32be3bf72bffa92847724a0d2ca5fa70a636b9a80b836a28d6ccf244888c8a3"

ROS_SPN = "robot_controllers"
S = "${WORKDIR}/robot_controllers-release-release-melodic-robot_controllers_interface-0.6.0-0"

inherit catkin
