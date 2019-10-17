DESCRIPTION = "ROS packaging system"
AUTHOR = "Eric Berger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin mk rosbuild roslang roslib rosbash rosboost-cfg rosclean roscreate rosmake rosunit"

RDEPENDS_${PN} = "catkin mk rosbuild roslang roslib rosbash rosboost-cfg rosclean roscreate rosmake rosunit"

SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/melodic/ros/1.14.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5f8dbe404feda46c6e4d4c0741df14af"
SRC_URI[sha256sum] = "f92a3cbe96dd8d490c60a52ff22ed01bb00d7c9a6e59a1bbfc7700d9b693d82e"

S = "${WORKDIR}/ros-release-release-melodic-ros-1.14.6-0"

inherit catkin
