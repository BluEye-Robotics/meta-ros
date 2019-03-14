DESCRIPTION = "This package containes numerous examples of how to use SMACH. See the examples directory."
AUTHOR = "Jonathan Bohren"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy asmach smach-ros turtlesim actionlib actionlib-msgs message-generation rospy asmach smach-ros turtlesim actionlib actionlib-msgs"

RDEPENDS_${PN} = "rospy asmach smach-ros turtlesim actionlib actionlib-msgs"

SRC_URI = "https://github.com/pr2-gbp/linux_networking-release/archive/release/melodic/asmach_tutorials/1.0.13-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f7f4d9b0f1aa7787d3f2d6bb657742ab"
SRC_URI[sha256sum] = "ca0024ddfd9f62f4c76291300d9cf50e15fbc87e64af3823255db33e4285792e"

ROS_SPN = "linux_networking"
S = "${WORKDIR}/linux_networking-release-release-melodic-asmach_tutorials-1.0.13-2"

inherit catkin
