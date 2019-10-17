DESCRIPTION = "flexbe_testing provides a framework for unit testing states."
AUTHOR = "Philipp Schillinger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rostest rospy smach-ros flexbe-core flexbe-msgs"

RDEPENDS_${PN} = "rospy smach-ros flexbe-core flexbe-msgs"

SRC_URI = "https://github.com/FlexBE/flexbe_behavior_engine-release/archive/release/melodic/flexbe_testing/1.2.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a47335a751b973b02505634743458f98"
SRC_URI[sha256sum] = "e19a18bd897d936a6fe6c199124ea3faf232f435c5588a91301973575838825d"

ROS_SPN = "flexbe"
S = "${WORKDIR}/flexbe_behavior_engine-release-release-melodic-flexbe_testing-1.2.2-1"

inherit catkin
