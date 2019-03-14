DESCRIPTION = "Controller to publish joint state"
AUTHOR = "Wim Meeussen"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "controller-interface hardware-interface pluginlib sensor-msgs realtime-tools roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/melodic/joint_state_controller/0.14.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "74f188f8a9295214d7fe32be3c58f785"
SRC_URI[sha256sum] = "23c02e2b6b37c5502acb54ae071ee257f7803f0265d1b5e301444762108999a0"

ROS_SPN = "ros_controllers"
S = "${WORKDIR}/ros_controllers-release-release-melodic-joint_state_controller-0.14.3-0"

inherit catkin
