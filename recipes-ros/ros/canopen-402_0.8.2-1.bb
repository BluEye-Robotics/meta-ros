DESCRIPTION = "This implements the CANopen device profile for drives and motion control. CiA(r) 402"
AUTHOR = "Thiago de Freitas"
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "canopen-master class-loader"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/melodic/canopen_402/0.8.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3bf60c5dc99e95b1ba2d3cb5d9fd508b"
SRC_URI[sha256sum] = "6292ad50cab1fafeeb44ec195871040a5d694ce80eab76635fa5c15054801da0"

ROS_SPN = "ros_canopen"
S = "${WORKDIR}/ros_canopen-release-release-melodic-canopen_402-0.8.2-1"

inherit catkin
