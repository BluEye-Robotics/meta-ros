DESCRIPTION = "flexbe_widget implements some smaller scripts for the behavior engine."
AUTHOR = "Philipp Schillinger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "smach-ros rospy flexbe-core flexbe-msgs"

RDEPENDS_${PN} = "smach-ros rospy flexbe-core flexbe-msgs"

SRC_URI = "https://github.com/FlexBE/flexbe_behavior_engine-release/archive/release/melodic/flexbe_widget/1.2.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e31aa1bdaca9cbbc78e1494fbb638bcb"
SRC_URI[sha256sum] = "f819f570ebe1a4e899edd92f7e26e63068466e4db3e652be4c0fc763f8e6c4cf"

ROS_SPN = "flexbe"
S = "${WORKDIR}/flexbe_behavior_engine-release-release-melodic-flexbe_widget-1.2.2-1"

inherit catkin
