DESCRIPTION = "franka_control provides a hardware node to control a Franka Emika research robot"
AUTHOR = "Franka Emika GmbH"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation libfranka actionlib actionlib-msgs controller-interface controller-manager franka-hw franka-msgs geometry-msgs pluginlib realtime-tools roscpp sensor-msgs tf2-msgs tf message-runtime"

RDEPENDS_${PN} = "franka-description franka-gripper joint-state-publisher message-runtime robot-state-publisher"

SRC_URI = "https://github.com/frankaemika/franka_ros-release/archive/release/melodic/franka_control/0.6.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f476f34d7351f3da95f78151fef5e0e9"
SRC_URI[sha256sum] = "c4208eafa2862dfd1fcc04d96fef28e4af437c78503dff4765d4e251add9b9bd"

ROS_SPN = "franka_ros"
S = "${WORKDIR}/franka_ros-release-release-melodic-franka_control-0.6.0-1"

inherit catkin
