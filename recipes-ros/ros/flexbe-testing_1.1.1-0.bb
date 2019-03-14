DESCRIPTION = "flexbe_testing provides a framework for unit testing states."
AUTHOR = "Philipp Schillinger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rostest rospy smach-ros flexbe-core flexbe-msgs"

RDEPENDS_${PN} = "rospy smach-ros flexbe-core flexbe-msgs"

SRC_URI = "https://github.com/FlexBE/flexbe_behavior_engine-release/archive/release/melodic/flexbe_testing/1.1.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "83686d8b2939757647477fdf550c70e1"
SRC_URI[sha256sum] = "4cf76c948796fc9fc57b86ec6ab1d0467c6b93a5703d2af4b215210cbbb3fe3d"

ROS_SPN = "flexbe"
S = "${WORKDIR}/flexbe_behavior_engine-release-release-melodic-flexbe_testing-1.1.1-0"

inherit catkin
