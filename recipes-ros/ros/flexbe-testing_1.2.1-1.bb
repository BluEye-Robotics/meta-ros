DESCRIPTION = "flexbe_testing provides a framework for unit testing states."
AUTHOR = "Philipp Schillinger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rostest rospy smach-ros flexbe-core flexbe-msgs"

RDEPENDS_${PN} = "rospy smach-ros flexbe-core flexbe-msgs"

SRC_URI = "https://github.com/FlexBE/flexbe_behavior_engine-release/archive/release/melodic/flexbe_testing/1.2.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3a2eba6fb2f55985a38dcabfa6998562"
SRC_URI[sha256sum] = "f36e5e9f97fafab229cdf8d9e37765c6b77d2c446c4baa720994423751e64b11"

ROS_SPN = "flexbe"
S = "${WORKDIR}/flexbe_behavior_engine-release-release-melodic-flexbe_testing-1.2.1-1"

inherit catkin
