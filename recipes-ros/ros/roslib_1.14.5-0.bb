DESCRIPTION = "Base dependencies and support libraries for ROS. roslib contains many of the common data structures and tools that are shared across ROS client library implementations."
AUTHOR = "Ken Conley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost rospack catkin python-rospkg ros-environment rospack"

RDEPENDS_${PN} = "catkin python-rospkg ros-environment rospack"

SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/melodic/roslib/1.14.5-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "72227739ca0b2a10c439922f1b81ef50"
SRC_URI[sha256sum] = "01b55e8e9f8c3eeeaf7c45667d84cc2d02198612629c4418e7da35f0e5ad27c1"

ROS_SPN = "ros"
S = "${WORKDIR}/ros-release-release-melodic-roslib-1.14.5-0"

inherit catkin
