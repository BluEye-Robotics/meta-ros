DESCRIPTION = "CiA(r) CANopen 301 master implementation with support for interprocess master synchronisation."
AUTHOR = "Mathias Lüdtke"
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "boost class-loader socketcan-interface"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/melodic/canopen_master/0.8.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "124ab9113622b1368b365ff31d762d8b"
SRC_URI[sha256sum] = "9034297e3286ade1aa0d5f898b58551c21e93f2a12ca9984a287095d252aaf50"

ROS_SPN = "ros_canopen"
S = "${WORKDIR}/ros_canopen-release-release-melodic-canopen_master-0.8.1-1"

inherit catkin
