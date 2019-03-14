DESCRIPTION = "Locomotor is an extensible path planning coordination engine that replaces move_base. The goal is to provide a mechanism for controlling what happens when the global and local planners succeed and fail. It leverages ROS callback queues to coordinate multiple threads."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib geometry-msgs locomotor-msgs nav-2d-msgs nav-2d-utils nav-core2 nav-msgs pluginlib roscpp rospy"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/DLu/robot_navigation-release/archive/release/melodic/locomotor/0.2.5-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "385ccbb0838323c6e9559963ad9fc69a"
SRC_URI[sha256sum] = "d963fa2820b1c75aaf1f74fa7756f26d27cc254b1f01ab40a5c078c2bae8a224"

ROS_SPN = "robot_navigation"
S = "${WORKDIR}/robot_navigation-release-release-melodic-locomotor-0.2.5-1"

inherit catkin
