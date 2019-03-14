DESCRIPTION = "A set of message filters which take in messages and may output those messages at a later time, based on the conditions that filter needs met."
AUTHOR = "Josh Faust"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost rosconsole roscpp rostest rosunit rosconsole roscpp"

RDEPENDS_${PN} = "rosconsole roscpp"

SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/melodic/message_filters/1.14.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "06aba135449159ba348f66ff23ece11b"
SRC_URI[sha256sum] = "3eb38ff43701662023ac5e7141fb50303fb27657822275b4d4da92ed661ff72d"

ROS_SPN = "ros_comm"
S = "${WORKDIR}/ros_comm-release-release-melodic-message_filters"

inherit catkin
