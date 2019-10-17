DESCRIPTION = "This implements the CANopen device profile for drives and motion control. CiA(r) 402"
AUTHOR = "Thiago de Freitas"
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "canopen-master class-loader"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/melodic/canopen_402/0.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0f172d53d77a8a39ba696645aea05a7d"
SRC_URI[sha256sum] = "efde470bfc5b7f1a067d861078f5de826f05e7af4bb8dd3456f51664961d1b2c"

ROS_SPN = "ros_canopen"
S = "${WORKDIR}/ros_canopen-release-release-melodic-canopen_402-0.8.0-0"

inherit catkin
