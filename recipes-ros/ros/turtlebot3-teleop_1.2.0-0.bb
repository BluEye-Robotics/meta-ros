DESCRIPTION = "Provides teleoperation using keyboard for TurtleBot3."
AUTHOR = "Melonee Wise"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy geometry-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3-release/archive/release/melodic/turtlebot3_teleop/1.2.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8e746ddedc7027b5d7dc87456759df99"
SRC_URI[sha256sum] = "e50544b8a90f38c20e2ff250224eee48ac0d667fefcb7fa172e1b2dafb6119e8"

ROS_SPN = "turtlebot3"
S = "${WORKDIR}/turtlebot3-release-release-melodic-turtlebot3_teleop-1.2.0-0"

inherit catkin
