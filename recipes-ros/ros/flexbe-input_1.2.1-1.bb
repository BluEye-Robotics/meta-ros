DESCRIPTION = "flexbe_input enables to send data to onboard behavior when required."
AUTHOR = "Philipp Schillinger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib smach-ros rospy flexbe-msgs"

RDEPENDS_${PN} = "actionlib smach-ros rospy flexbe-msgs"

SRC_URI = "https://github.com/FlexBE/flexbe_behavior_engine-release/archive/release/melodic/flexbe_input/1.2.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "27b242b928d084842343e045002f33e8"
SRC_URI[sha256sum] = "c9e2836859104ed44701c34f7fb890b02fd8bb896f1101ff1305c302b2660b93"

ROS_SPN = "flexbe"
S = "${WORKDIR}/flexbe_behavior_engine-release-release-melodic-flexbe_input-1.2.1-1"

inherit catkin
