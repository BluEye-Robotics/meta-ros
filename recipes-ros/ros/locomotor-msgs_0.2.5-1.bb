DESCRIPTION = "Action definition for Locomotor"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation actionlib-msgs nav-2d-msgs message-runtime"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/DLu/robot_navigation-release/archive/release/melodic/locomotor_msgs/0.2.5-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "13d9e7564f89b11ad655c5b7bd7182b3"
SRC_URI[sha256sum] = "585d9e6b911d982399db49255a0dd202555a1d36413898683de933e21d45b6ce"

ROS_SPN = "robot_navigation"
S = "${WORKDIR}/robot_navigation-release-release-melodic-locomotor_msgs-0.2.5-1"

inherit catkin
