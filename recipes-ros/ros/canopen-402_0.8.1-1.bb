DESCRIPTION = "This implements the CANopen device profile for drives and motion control. CiA(r) 402"
AUTHOR = "Thiago de Freitas"
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "canopen-master class-loader"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/melodic/canopen_402/0.8.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7c22e89433adbee66475d067117999d8"
SRC_URI[sha256sum] = "c0daf1aa2a7d9f3509e9e0e631f7453f58fa8674a00e8471d2241b2ce8fcd5b9"

ROS_SPN = "ros_canopen"
S = "${WORKDIR}/ros_canopen-release-release-melodic-canopen_402-0.8.1-1"

inherit catkin
