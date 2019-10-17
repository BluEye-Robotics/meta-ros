DESCRIPTION = "flexbe_input enables to send data to onboard behavior when required."
AUTHOR = "Philipp Schillinger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib smach-ros rospy flexbe-msgs"

RDEPENDS_${PN} = "actionlib smach-ros rospy flexbe-msgs"

SRC_URI = "https://github.com/FlexBE/flexbe_behavior_engine-release/archive/release/melodic/flexbe_input/1.2.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d9a2b047bfc331a89abd30225cb8c8be"
SRC_URI[sha256sum] = "49e9b58df818ce46656a7482b8c0b260f8cc45f0c04dc986dd06163ba36a3245"

ROS_SPN = "flexbe"
S = "${WORKDIR}/flexbe_behavior_engine-release-release-melodic-flexbe_input-1.2.2-1"

inherit catkin
