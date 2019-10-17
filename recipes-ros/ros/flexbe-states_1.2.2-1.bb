DESCRIPTION = "flexbe_states provides a collection of predefined states. Feel free to add new states."
AUTHOR = "Philipp Schillinger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rostest smach-ros rospy rosbag flexbe-msgs flexbe-testing"

RDEPENDS_${PN} = "smach-ros rospy rosbag flexbe-msgs flexbe-testing"

SRC_URI = "https://github.com/FlexBE/flexbe_behavior_engine-release/archive/release/melodic/flexbe_states/1.2.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a35da5d9eb46eab485ac486b50f7ee80"
SRC_URI[sha256sum] = "85def34946171a90fdc3dfeb21e7507d40edaff16376e7883136ba496bd199ba"

ROS_SPN = "flexbe"
S = "${WORKDIR}/flexbe_behavior_engine-release-release-melodic-flexbe_states-1.2.2-1"

inherit catkin
