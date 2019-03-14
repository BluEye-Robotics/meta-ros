DESCRIPTION = "flexbe_onboard implements the robot-side of the behavior engine from where all behaviors are started."
AUTHOR = "Philipp Schillinger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "smach-ros rospy flexbe-core flexbe-msgs"

RDEPENDS_${PN} = "smach-ros rospy flexbe-core flexbe-msgs"

SRC_URI = "https://github.com/FlexBE/flexbe_behavior_engine-release/archive/release/melodic/flexbe_onboard/1.1.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "50d767db19144c0433d37798a432d080"
SRC_URI[sha256sum] = "4e9ed39007e361c836bd8287950c9edf2fc8b36eceae6bd17f3b2edf6cc72942"

ROS_SPN = "flexbe"
S = "${WORKDIR}/flexbe_behavior_engine-release-release-melodic-flexbe_onboard-1.1.1-0"

inherit catkin
