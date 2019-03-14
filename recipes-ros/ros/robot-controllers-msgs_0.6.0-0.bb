DESCRIPTION = "Messages for use with robot_controllers framework."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs message-generation std-msgs actionlib-msgs message-runtime std-msgs"

RDEPENDS_${PN} = "actionlib-msgs message-runtime std-msgs"

SRC_URI = "https://github.com/fetchrobotics-gbp/robot_controllers-release/archive/release/melodic/robot_controllers_msgs/0.6.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "37845c5c5c282ed73653dd867a9d8a93"
SRC_URI[sha256sum] = "e4e27516f3adeed4b5e046e2660975a999082fd1d0322b5c1f5ca0c9c2f0759b"

ROS_SPN = "robot_controllers"
S = "${WORKDIR}/robot_controllers-release-release-melodic-robot_controllers_msgs-0.6.0-0"

inherit catkin
