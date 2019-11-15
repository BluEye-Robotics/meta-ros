DESCRIPTION = "This package containes numerous examples of how to use SMACH. See the examples directory."
AUTHOR = "Jonathan Bohren"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy asmach smach-ros turtlesim actionlib actionlib-msgs message-generation rospy asmach smach-ros turtlesim actionlib actionlib-msgs"

RDEPENDS_${PN} = "rospy asmach smach-ros turtlesim actionlib actionlib-msgs"

SRC_URI = "https://github.com/pr2-gbp/linux_networking-release/archive/release/melodic/asmach_tutorials/1.0.16-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f477eed990ecc7b3e83e95129ab4e7be"
SRC_URI[sha256sum] = "d4a5d35e1424c9a9e17f9a66b1bbea3de63f71d037df9cc932cf28f62c00f69e"

ROS_SPN = "linux_networking"
S = "${WORKDIR}/linux_networking-release-release-melodic-asmach_tutorials-1.0.16-1"

inherit catkin
