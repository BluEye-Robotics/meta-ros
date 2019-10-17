DESCRIPTION = "flexbe_core provides the core smach extension for the FlexBE behavior engine."
AUTHOR = "Philipp Schillinger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "smach-ros rospy tf diagnostic-msgs flexbe-msgs"

RDEPENDS_${PN} = "smach-ros rospy tf diagnostic-msgs flexbe-msgs"

SRC_URI = "https://github.com/FlexBE/flexbe_behavior_engine-release/archive/release/melodic/flexbe_core/1.2.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a4b83096bf5abec8c01dd7225ea5db94"
SRC_URI[sha256sum] = "cddf2023ea8181e51a61692ba2ed36c1ad295a26ce047a223d92d1f17bd9e2b1"

ROS_SPN = "flexbe"
S = "${WORKDIR}/flexbe_behavior_engine-release-release-melodic-flexbe_core-1.2.2-1"

inherit catkin
