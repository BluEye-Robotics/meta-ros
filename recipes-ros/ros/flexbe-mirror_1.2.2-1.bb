DESCRIPTION = "flexbe_mirror implements functionality to remotely mirror an executed behavior."
AUTHOR = "Philipp Schillinger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "smach-ros rospy flexbe-core flexbe-widget flexbe-msgs"

RDEPENDS_${PN} = "smach-ros rospy flexbe-core flexbe-widget flexbe-msgs"

SRC_URI = "https://github.com/FlexBE/flexbe_behavior_engine-release/archive/release/melodic/flexbe_mirror/1.2.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a5d8c6b1559affee1314e50b4f8d6a7a"
SRC_URI[sha256sum] = "7f9f4ad139201af0366254fb0f2fc7b3b4120a4b3c0dab729b03ef5f30a14339"

ROS_SPN = "flexbe"
S = "${WORKDIR}/flexbe_behavior_engine-release-release-melodic-flexbe_mirror-1.2.2-1"

inherit catkin
