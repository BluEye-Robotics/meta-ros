DESCRIPTION = "flexbe_states provides a collection of predefined states. Feel free to add new states."
AUTHOR = "Philipp Schillinger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rostest smach-ros rospy rosbag flexbe-msgs flexbe-testing"

RDEPENDS_${PN} = "smach-ros rospy rosbag flexbe-msgs flexbe-testing"

SRC_URI = "https://github.com/FlexBE/flexbe_behavior_engine-release/archive/release/melodic/flexbe_states/1.2.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a94cfa0952c65eff79fdcef772cc1052"
SRC_URI[sha256sum] = "5e9094761ffc0ef7cfe630c2647c261f3842dabf5f78a792ad7fc49a815fde7d"

ROS_SPN = "flexbe"
S = "${WORKDIR}/flexbe_behavior_engine-release-release-melodic-flexbe_states-1.2.1-1"

inherit catkin
