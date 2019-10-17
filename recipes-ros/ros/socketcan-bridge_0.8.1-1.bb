DESCRIPTION = "Conversion nodes for messages from SocketCAN to a ROS Topic and vice versa."
AUTHOR = "Ivor Wanders"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "can-msgs roscpp socketcan-interface"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/melodic/socketcan_bridge/0.8.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "27e655cff93f14aaa4c412396762c9c6"
SRC_URI[sha256sum] = "bf40769e5652dc526c8434b55c9a4bab56ae24c4138df39712c285f82a8acba9"

ROS_SPN = "ros_canopen"
S = "${WORKDIR}/ros_canopen-release-release-melodic-socketcan_bridge-0.8.1-1"

inherit catkin
