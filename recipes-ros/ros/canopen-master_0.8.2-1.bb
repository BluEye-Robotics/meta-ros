DESCRIPTION = "CiA(r) CANopen 301 master implementation with support for interprocess master synchronisation."
AUTHOR = "Mathias Lüdtke"
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "boost class-loader socketcan-interface"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/melodic/canopen_master/0.8.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5b9981fb1ec8d27aba71702f44116425"
SRC_URI[sha256sum] = "f75eca9da2e2e16d2f0e5397e2ed8f651bc1a84a657c9168a49619f8815145b5"

ROS_SPN = "ros_canopen"
S = "${WORKDIR}/ros_canopen-release-release-melodic-canopen_master-0.8.2-1"

inherit catkin
