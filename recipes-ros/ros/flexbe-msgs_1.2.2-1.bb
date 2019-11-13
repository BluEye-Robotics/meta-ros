DESCRIPTION = "flexbe_msgs provides the messages used by FlexBE."
AUTHOR = "Philipp Schillinger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation actionlib actionlib-msgs actionlib actionlib-msgs message-runtime smach-ros rospy"

RDEPENDS_${PN} = "actionlib actionlib-msgs message-runtime smach-ros rospy"

SRC_URI = "https://github.com/FlexBE/flexbe_behavior_engine-release/archive/release/melodic/flexbe_msgs/1.2.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3c25eca8e8739c45be65c7f9315e1099"
SRC_URI[sha256sum] = "adde3f5455d430996b8139ddba6be0e1e9b35bbde315b1faa3c27458e18a9510"

ROS_SPN = "flexbe"
S = "${WORKDIR}/flexbe_behavior_engine-release-release-melodic-flexbe_msgs-1.2.2-1"

inherit catkin
