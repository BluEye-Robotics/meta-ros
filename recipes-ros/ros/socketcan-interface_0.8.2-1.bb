DESCRIPTION = "Generic CAN interface description with helpers for filtering and driver implementation. Further a socketcan implementation based on boost::asio is included."
AUTHOR = "Mathias Lüdtke"
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "boost class-loader console-bridge virtual/kernel"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/melodic/socketcan_interface/0.8.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d7bd50e11312d5feb11fb8d932ab86c9"
SRC_URI[sha256sum] = "e59e02fb68b878c51ee9adbad6008109f85495608d31fd2a139a2dcfef55e572"

ROS_SPN = "ros_canopen"
S = "${WORKDIR}/ros_canopen-release-release-melodic-socketcan_interface-0.8.2-1"

inherit catkin
