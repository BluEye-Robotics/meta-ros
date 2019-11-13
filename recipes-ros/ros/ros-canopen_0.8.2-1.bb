DESCRIPTION = "A generic canopen implementation for ROS"
AUTHOR = "Florian Weisshardt"
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = ""

RDEPENDS_${PN} = "can-msgs canopen-402 canopen-chain-node canopen-master canopen-motor-node socketcan-bridge socketcan-interface"

SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/melodic/ros_canopen/0.8.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5bbb18b386a6cb1b7a742853748a3517"
SRC_URI[sha256sum] = "aadded2d0cbb3a22d1548ad1e625d38c697863cc920bfbf4d7f9850d50cb4bc7"

S = "${WORKDIR}/ros_canopen-release-release-melodic-ros_canopen-0.8.2-1"

inherit catkin
