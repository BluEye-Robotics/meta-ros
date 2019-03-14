DESCRIPTION = "ROS"
AUTHOR = "Ken Conley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rosgraph python-defusedxml"

RDEPENDS_${PN} = "rosgraph python-defusedxml"

SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/melodic/rosmaster/1.14.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "94abd85f0cbd0c5bce144d93e6d3b2dd"
SRC_URI[sha256sum] = "500bb9891c37a3a84955907eae3e654fa5afd544930b1d987c14e9199c52772b"

ROS_SPN = "ros_comm"
S = "${WORKDIR}/ros_comm-release-release-melodic-rosmaster-1.14.3-0"

inherit catkin
