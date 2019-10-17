DESCRIPTION = "Base dependencies and support libraries for ROS. roslib contains many of the common data structures and tools that are shared across ROS client library implementations."
AUTHOR = "Ken Conley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost rospack"

RDEPENDS_${PN} = "catkin python-rospkg ros-environment"

SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/melodic/roslib/1.14.7-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cfc104274277e16ede1c1a71fef4c659"
SRC_URI[sha256sum] = "68b6b424fda14f327baa17aa1a2417616b783851150561af13670b03e0f8e51d"

ROS_SPN = "ros"
S = "${WORKDIR}/ros-release-release-melodic-roslib-1.14.7-1"

inherit catkin
