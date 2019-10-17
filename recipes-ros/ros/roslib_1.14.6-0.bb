DESCRIPTION = "Base dependencies and support libraries for ROS. roslib contains many of the common data structures and tools that are shared across ROS client library implementations."
AUTHOR = "Ken Conley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost rospack catkin python-rospkg ros-environment rospack"

RDEPENDS_${PN} = "catkin python-rospkg ros-environment rospack"

SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/melodic/roslib/1.14.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1fdd5d7c9d74d2a97096dfce8e0d6764"
SRC_URI[sha256sum] = "e6a681f31b005d86d3d87877a69d398e5736ac4fc8cd3e65d8900d05b96f9b9b"

ROS_SPN = "ros"
S = "${WORKDIR}/ros-release-release-melodic-roslib-1.14.6-0"

inherit catkin
