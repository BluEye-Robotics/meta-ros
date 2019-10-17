DESCRIPTION = "Generic CAN interface description with helpers for filtering and driver implementation. Further a socketcan implementation based on boost::asio is included."
AUTHOR = "Mathias Lüdtke"
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "boost class-loader virtual/kernel"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/melodic/socketcan_interface/0.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d9b066a4e3bcabe34c74036f26cd0ca1"
SRC_URI[sha256sum] = "46aa16fc7db59c4b0353cba915f7ccadeff9eb1b4b1d521d166d51a10b6d53a5"

ROS_SPN = "ros_canopen"
S = "${WORKDIR}/ros_canopen-release-release-melodic-socketcan_interface-0.8.0-0"

inherit catkin
