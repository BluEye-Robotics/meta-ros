DESCRIPTION = "flexbe_onboard implements the robot-side of the behavior engine from where all behaviors are started."
AUTHOR = "Philipp Schillinger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "smach-ros rospy flexbe-core flexbe-msgs"

RDEPENDS_${PN} = "smach-ros rospy flexbe-core flexbe-msgs"

SRC_URI = "https://github.com/FlexBE/flexbe_behavior_engine-release/archive/release/melodic/flexbe_onboard/1.2.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "264aa023e20b1b0beab08fd66d3d5806"
SRC_URI[sha256sum] = "834f106732efdadb8b8bd5df9d79feffb0f2cdcff13209eb626fb8faa52903cb"

ROS_SPN = "flexbe"
S = "${WORKDIR}/flexbe_behavior_engine-release-release-melodic-flexbe_onboard-1.2.2-1"

inherit catkin
