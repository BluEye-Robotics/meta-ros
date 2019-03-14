DESCRIPTION = "flexbe_widget implements some smaller scripts for the behavior engine."
AUTHOR = "Philipp Schillinger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "smach-ros rospy flexbe-core flexbe-msgs"

RDEPENDS_${PN} = "smach-ros rospy flexbe-core flexbe-msgs"

SRC_URI = "https://github.com/FlexBE/flexbe_behavior_engine-release/archive/release/melodic/flexbe_widget/1.1.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c8b8392f20991f9ee6fd9b849b5b6f08"
SRC_URI[sha256sum] = "67bfa42519de347f4ec5606a6b57d2ff0e2eccf0485eda757d3a855783c11bd9"

ROS_SPN = "flexbe"
S = "${WORKDIR}/flexbe_behavior_engine-release-release-melodic-flexbe_widget-1.1.1-0"

inherit catkin
