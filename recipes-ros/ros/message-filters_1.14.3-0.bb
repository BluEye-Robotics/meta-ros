DESCRIPTION = "A set of message filters which take in messages and may output those messages at a later time, based on the conditions that filter needs met."
AUTHOR = "Josh Faust"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost rosconsole roscpp rostest rosunit rosconsole roscpp"

RDEPENDS_${PN} = "rosconsole roscpp"

SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/melodic/message_filters/1.14.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "431dae23c4cbf44aed4139824044ce2b"
SRC_URI[sha256sum] = "3a6ce5214cb6b17a3af6268ddac55c5ac812ef09eb97685e6930da32799a8a3e"

ROS_SPN = "ros_comm"
S = "${WORKDIR}/ros_comm-release-release-melodic-message_filters-1.14.3-0"

inherit catkin
