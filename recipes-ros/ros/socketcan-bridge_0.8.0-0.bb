DESCRIPTION = "Conversion nodes for messages from SocketCAN to a ROS Topic and vice versa."
AUTHOR = "Ivor Wanders"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "can-msgs roscpp socketcan-interface"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/melodic/socketcan_bridge/0.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "33397d669296c712e6c765f420cd7684"
SRC_URI[sha256sum] = "6f82d21a83caa361961006c49bf69268de9215d5a8586dbf90216ea0f07dfec6"

ROS_SPN = "ros_canopen"
S = "${WORKDIR}/ros_canopen-release-release-melodic-socketcan_bridge-0.8.0-0"

inherit catkin
