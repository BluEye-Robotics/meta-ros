DESCRIPTION = "Generic CAN interface description with helpers for filtering and driver implementation. Further a socketcan implementation based on boost::asio is included."
AUTHOR = "Mathias Lüdtke"
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "boost class-loader virtual/kernel"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/melodic/socketcan_interface/0.8.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3f865a47ea4e1c28558ed25246ded233"
SRC_URI[sha256sum] = "bb0aa5efe5e63a0a75d4f2fb7595be0b72c47eb94d175b942c8e7653d5409377"

ROS_SPN = "ros_canopen"
S = "${WORKDIR}/ros_canopen-release-release-melodic-socketcan_interface-0.8.1-1"

inherit catkin
