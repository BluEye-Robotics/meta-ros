DESCRIPTION = "flexbe_core provides the core smach extension for the FlexBE behavior engine."
AUTHOR = "Philipp Schillinger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "smach-ros rospy tf diagnostic-msgs flexbe-msgs"

RDEPENDS_${PN} = "smach-ros rospy tf diagnostic-msgs flexbe-msgs"

SRC_URI = "https://github.com/FlexBE/flexbe_behavior_engine-release/archive/release/melodic/flexbe_core/1.1.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f8c45be8ebf1b6932544be147e8a21c0"
SRC_URI[sha256sum] = "9c75df22b869597c9022881dc78c9b2bd270664eafd0b74c23cb3ad0fa431aa1"

ROS_SPN = "flexbe"
S = "${WORKDIR}/flexbe_behavior_engine-release-release-melodic-flexbe_core-1.1.1-0"

inherit catkin
