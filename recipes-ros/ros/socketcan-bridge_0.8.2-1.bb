DESCRIPTION = "Conversion nodes for messages from SocketCAN to a ROS Topic and vice versa."
AUTHOR = "Ivor Wanders"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "can-msgs rosconsole-bridge roscpp socketcan-interface"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/melodic/socketcan_bridge/0.8.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7e1f7d88d9f089c513f54cf784108b1d"
SRC_URI[sha256sum] = "b757ed9a8e2e7bce9c8834e356e00263d786ac163229b6846db205638f941174"

ROS_SPN = "ros_canopen"
S = "${WORKDIR}/ros_canopen-release-release-melodic-socketcan_bridge-0.8.2-1"

inherit catkin
