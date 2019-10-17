DESCRIPTION = "CiA(r) CANopen 301 master implementation with support for interprocess master synchronisation."
AUTHOR = "Mathias Lüdtke"
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "boost class-loader socketcan-interface"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/melodic/canopen_master/0.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5c4b9de2e1b1bc49db5141b7b7b914ee"
SRC_URI[sha256sum] = "89f6dfd60a4aac3dfa09d192fa08d5f4512de568af52377d9ae64e7ff271d186"

ROS_SPN = "ros_canopen"
S = "${WORKDIR}/ros_canopen-release-release-melodic-canopen_master-0.8.0-0"

inherit catkin
