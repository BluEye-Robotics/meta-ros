DESCRIPTION = "ROS packaging system"
AUTHOR = "Eric Berger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin mk rosbuild roslang roslib rosbash rosboost-cfg rosclean roscreate rosmake rosunit"

RDEPENDS_${PN} = "catkin mk rosbuild roslang roslib rosbash rosboost-cfg rosclean roscreate rosmake rosunit"

SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/melodic/ros/1.14.7-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "39f65bf02aabc5df67aee406f928b8f7"
SRC_URI[sha256sum] = "d9c8100fd5dcf41f7d4645263161d02ed5157414b32acac7a5d4ff984892954e"

S = "${WORKDIR}/ros-release-release-melodic-ros-1.14.7-1"

inherit catkin
