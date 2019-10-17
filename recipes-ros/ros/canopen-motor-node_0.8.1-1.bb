DESCRIPTION = "canopen_chain_node specialization for handling of canopen_402 motor devices. It facilitates interface abstraction with ros_control."
AUTHOR = "Mathias Lüdtke"
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "controller-manager-msgs canopen-402 canopen-chain-node canopen-master controller-manager filters hardware-interface joint-limits-interface muparser roscpp urdf"

RDEPENDS_${PN} = "controller-manager-msgs"

SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/melodic/canopen_motor_node/0.8.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4d4103f6d4ac0eeaaff04d02a62ebc01"
SRC_URI[sha256sum] = "466596754b31773c3bd25237f928349bb42a4b8f5e9d552e771fe8bd2a01c795"

ROS_SPN = "ros_canopen"
S = "${WORKDIR}/ros_canopen-release-release-melodic-canopen_motor_node-0.8.1-1"

inherit catkin
