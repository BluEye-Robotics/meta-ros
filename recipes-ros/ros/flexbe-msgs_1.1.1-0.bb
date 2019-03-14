DESCRIPTION = "flexbe_msgs provides the messages used by FlexBE."
AUTHOR = "Philipp Schillinger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation actionlib actionlib-msgs actionlib actionlib-msgs message-runtime smach-ros rospy"

RDEPENDS_${PN} = "actionlib actionlib-msgs message-runtime smach-ros rospy"

SRC_URI = "https://github.com/FlexBE/flexbe_behavior_engine-release/archive/release/melodic/flexbe_msgs/1.1.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "59f0e5a46f85d0cf05713f98ef593a0d"
SRC_URI[sha256sum] = "f0d0a0750c9981f6c79fdd2b204fb58cf03f3c45d9bf299c5e82e51046b9ffa5"

ROS_SPN = "flexbe"
S = "${WORKDIR}/flexbe_behavior_engine-release-release-melodic-flexbe_msgs-1.1.1-0"

inherit catkin
