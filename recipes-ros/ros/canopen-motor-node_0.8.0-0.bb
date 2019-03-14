DESCRIPTION = "canopen_chain_node specialization for handling of canopen_402 motor devices. It facilitates interface abstraction with ros_control."
AUTHOR = "Mathias Lüdtke"
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "controller-manager-msgs canopen-402 canopen-chain-node canopen-master controller-manager filters hardware-interface joint-limits-interface muparser roscpp urdf"

RDEPENDS_${PN} = "controller-manager-msgs"

SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/melodic/canopen_motor_node/0.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2f8c2cc19615fa3c0035ff6f47bb9e45"
SRC_URI[sha256sum] = "f771723a5af6fefabb6ab3313897e9ae04dbef4a37b18aa0163b331a99152066"

ROS_SPN = "ros_canopen"
S = "${WORKDIR}/ros_canopen-release-release-melodic-canopen_motor_node-0.8.0-0"

inherit catkin
