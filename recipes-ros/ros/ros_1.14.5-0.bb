DESCRIPTION = "ROS packaging system"
AUTHOR = "Eric Berger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin mk rosbuild roslang roslib rosbash rosboost-cfg rosclean roscreate rosmake rosunit"

RDEPENDS_${PN} = "catkin mk rosbuild roslang roslib rosbash rosboost-cfg rosclean roscreate rosmake rosunit"

SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/melodic/ros/1.14.5-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d1192e12312b03ca1a3972cdd2e6e45e"
SRC_URI[sha256sum] = "fe1ef829e9d01853f2cb03d50c63bfa215e78306ba6ebd2db01057c4837b77cc"

S = "${WORKDIR}/ros-release-release-melodic-ros-1.14.5-0"

inherit catkin
