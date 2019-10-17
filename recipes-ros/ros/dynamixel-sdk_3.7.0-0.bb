DESCRIPTION = "This package is wrapping version of ROBOTIS Dynamxel SDK for ROS. The ROBOTIS Dynamixel SDK, or SDK, is a software development library that provides Dynamixel control functions for packet communication. The API is designed for Dynamixel actuators and Dynamixel-based platforms."
AUTHOR = "Gilbert"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roscpp rospy"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ROBOTIS-GIT-release/DynamixelSDK-release/archive/release/melodic/dynamixel_sdk/3.7.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "825fbb133349514f23f1b01e58cf9f98"
SRC_URI[sha256sum] = "f6e3f4d552bb5e39c857b79e0c53233791f44ec01cbc768a507fb434f67d4492"

S = "${WORKDIR}/DynamixelSDK-release-release-melodic-dynamixel_sdk-3.7.0-0"

inherit catkin
