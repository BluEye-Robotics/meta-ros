DESCRIPTION = "actionlib_msgs defines the common messages to interact with an action server and an action client. For full documentation of the actionlib API see the"
AUTHOR = "Vijay Pradeep"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs message-generation message-runtime std-msgs"

RDEPENDS_${PN} = "message-generation message-runtime std-msgs"

SRC_URI = "https://github.com/ros-gbp/common_msgs-release/archive/release/melodic/actionlib_msgs/1.12.7-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "685cfd2c33d00088811514e144ef5526"
SRC_URI[sha256sum] = "0ad19d4f8698df04a22979c4b64f21991696c55877c952dc592e92ffb82122f0"

ROS_SPN = "common_msgs"
S = "${WORKDIR}/common_msgs-release-release-melodic-actionlib_msgs-1.12.7-0"

inherit catkin
