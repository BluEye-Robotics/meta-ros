DESCRIPTION = "A generic canopen implementation for ROS"
AUTHOR = "Florian Weisshardt"
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = ""

RDEPENDS_${PN} = "can-msgs canopen-402 canopen-chain-node canopen-master canopen-motor-node socketcan-bridge socketcan-interface"

SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/melodic/ros_canopen/0.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ab9322e670f13d6b168a75ddf51a9d28"
SRC_URI[sha256sum] = "8a5c65352a4fdb30215c811264abe1e29d326afebac95bb06f50124bb78ca5f1"

S = "${WORKDIR}/ros_canopen-release-release-melodic-ros_canopen-0.8.0-0"

inherit catkin
