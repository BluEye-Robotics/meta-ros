DESCRIPTION = "flexbe_states provides a collection of predefined states. Feel free to add new states."
AUTHOR = "Philipp Schillinger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rostest smach-ros rospy rosbag flexbe-msgs flexbe-testing"

RDEPENDS_${PN} = "smach-ros rospy rosbag flexbe-msgs flexbe-testing"

SRC_URI = "https://github.com/FlexBE/flexbe_behavior_engine-release/archive/release/melodic/flexbe_states/1.1.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "80e89e7d9594cfa153235f4d0071b1d5"
SRC_URI[sha256sum] = "b2e3d3a6bdf6e11e644baf06683f2107b95fe2ba03af79a9b3dde1f26878d5d2"

ROS_SPN = "flexbe"
S = "${WORKDIR}/flexbe_behavior_engine-release-release-melodic-flexbe_states-1.1.1-0"

inherit catkin
