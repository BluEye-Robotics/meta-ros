DESCRIPTION = "This package is wrapping version of ROBOTIS Dynamixel SDK for ROS. The ROBOTIS Dynamixel SDK, or SDK, is a software development library that provides Dynamixel control functions for packet communication. The API is designed for Dynamixel actuators and Dynamixel-based platforms."
AUTHOR = "Gilbert"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roscpp rospy"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ROBOTIS-GIT-release/DynamixelSDK-release/archive/release/melodic/dynamixel_sdk/3.7.21-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "60459d388d9295252c83b898a9b30042"
SRC_URI[sha256sum] = "6298842f665570ec035fbe27e02900b4018a4ff25185b73645c7143a87dee50a"

S = "${WORKDIR}/DynamixelSDK-release-release-melodic-dynamixel_sdk-3.7.21-1"

inherit catkin
