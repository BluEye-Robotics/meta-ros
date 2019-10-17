DESCRIPTION = "flexbe_msgs provides the messages used by FlexBE."
AUTHOR = "Philipp Schillinger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation actionlib actionlib-msgs actionlib actionlib-msgs message-runtime smach-ros rospy"

RDEPENDS_${PN} = "actionlib actionlib-msgs message-runtime smach-ros rospy"

SRC_URI = "https://github.com/FlexBE/flexbe_behavior_engine-release/archive/release/melodic/flexbe_msgs/1.2.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "758d9042d2efe061110f7f135ae5622e"
SRC_URI[sha256sum] = "2ee5f84ce9100d35d9bbc63bc4cf8563978818e3d0fb0d3f5396ccf1581270ce"

ROS_SPN = "flexbe"
S = "${WORKDIR}/flexbe_behavior_engine-release-release-melodic-flexbe_msgs-1.2.1-1"

inherit catkin
