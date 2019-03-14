DESCRIPTION = "flexbe_mirror implements functionality to remotely mirror an executed behavior."
AUTHOR = "Philipp Schillinger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "smach-ros rospy flexbe-core flexbe-widget flexbe-msgs"

RDEPENDS_${PN} = "smach-ros rospy flexbe-core flexbe-widget flexbe-msgs"

SRC_URI = "https://github.com/FlexBE/flexbe_behavior_engine-release/archive/release/melodic/flexbe_mirror/1.1.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7100970a1403cf9067437805e90e2731"
SRC_URI[sha256sum] = "a66ea44a5eaa6b4ac444918e78f7e11251bab2a9c097c282b7dae00576d903c2"

ROS_SPN = "flexbe"
S = "${WORKDIR}/flexbe_behavior_engine-release-release-melodic-flexbe_mirror-1.1.1-0"

inherit catkin
