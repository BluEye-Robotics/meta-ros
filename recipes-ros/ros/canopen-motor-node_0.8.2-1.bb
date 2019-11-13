DESCRIPTION = "canopen_chain_node specialization for handling of canopen_402 motor devices. It facilitates interface abstraction with ros_control."
AUTHOR = "Mathias Lüdtke"
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "controller-manager-msgs canopen-402 canopen-chain-node canopen-master controller-manager filters hardware-interface joint-limits-interface muparser roscpp urdf"

RDEPENDS_${PN} = "controller-manager-msgs"

SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/melodic/canopen_motor_node/0.8.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b42f2753f4be33a26a225674686303f0"
SRC_URI[sha256sum] = "1c117618dc45f113ec3deb803b06f85a010581000313f612c6394c2267da5dda"

ROS_SPN = "ros_canopen"
S = "${WORKDIR}/ros_canopen-release-release-melodic-canopen_motor_node-0.8.2-1"

inherit catkin
