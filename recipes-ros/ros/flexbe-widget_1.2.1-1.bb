DESCRIPTION = "flexbe_widget implements some smaller scripts for the behavior engine."
AUTHOR = "Philipp Schillinger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "smach-ros rospy flexbe-core flexbe-msgs"

RDEPENDS_${PN} = "smach-ros rospy flexbe-core flexbe-msgs"

SRC_URI = "https://github.com/FlexBE/flexbe_behavior_engine-release/archive/release/melodic/flexbe_widget/1.2.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "396f5c5e075b133d50d3d7f9d78412ef"
SRC_URI[sha256sum] = "b9e1b536fa572997e8c7a9748be42d4fdb5e1762ffeaa07849b708b9f1e2ffb4"

ROS_SPN = "flexbe"
S = "${WORKDIR}/flexbe_behavior_engine-release-release-melodic-flexbe_widget-1.2.1-1"

inherit catkin
