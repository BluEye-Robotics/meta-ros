DESCRIPTION = "A generic canopen implementation for ROS"
AUTHOR = "Florian Weisshardt"
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = ""

RDEPENDS_${PN} = "can-msgs canopen-402 canopen-chain-node canopen-master canopen-motor-node socketcan-bridge socketcan-interface"

SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/melodic/ros_canopen/0.8.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "992ef4b84dbe38e5ff604f2f9bc8bf65"
SRC_URI[sha256sum] = "550cd10ebf711cd81dd086201b32ae7ed767659ac3b6ad27580e02cc9f54feea"

S = "${WORKDIR}/ros_canopen-release-release-melodic-ros_canopen-0.8.1-1"

inherit catkin
