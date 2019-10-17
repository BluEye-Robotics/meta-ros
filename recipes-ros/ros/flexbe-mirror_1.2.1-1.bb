DESCRIPTION = "flexbe_mirror implements functionality to remotely mirror an executed behavior."
AUTHOR = "Philipp Schillinger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "smach-ros rospy flexbe-core flexbe-widget flexbe-msgs"

RDEPENDS_${PN} = "smach-ros rospy flexbe-core flexbe-widget flexbe-msgs"

SRC_URI = "https://github.com/FlexBE/flexbe_behavior_engine-release/archive/release/melodic/flexbe_mirror/1.2.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4f569ebb097ae0330fb0792d6a4aa3b4"
SRC_URI[sha256sum] = "e595f3cbb6d6c9c5d8aafe5d2110ee1069a64f4d6f7a9719fa8b703b052b9fb7"

ROS_SPN = "flexbe"
S = "${WORKDIR}/flexbe_behavior_engine-release-release-melodic-flexbe_mirror-1.2.1-1"

inherit catkin
