DESCRIPTION = "flexbe_core provides the core smach extension for the FlexBE behavior engine."
AUTHOR = "Philipp Schillinger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "smach-ros rospy tf diagnostic-msgs flexbe-msgs"

RDEPENDS_${PN} = "smach-ros rospy tf diagnostic-msgs flexbe-msgs"

SRC_URI = "https://github.com/FlexBE/flexbe_behavior_engine-release/archive/release/melodic/flexbe_core/1.2.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f67723554000bce4f7c7bddf7e168c76"
SRC_URI[sha256sum] = "bd8f7ddc3d12f8c61c03bfb8ead179bb437fefbb32e759ce1f1d8d057b18a1ba"

ROS_SPN = "flexbe"
S = "${WORKDIR}/flexbe_behavior_engine-release-release-melodic-flexbe_core-1.2.1-1"

inherit catkin
