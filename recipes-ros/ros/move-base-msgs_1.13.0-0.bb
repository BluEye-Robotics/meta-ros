DESCRIPTION = "Holds the action description and relevant messages for the move_base package"
AUTHOR = "Eitan Marder-Eppstein"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "actionlib-msgs geometry-msgs message-generation actionlib-msgs geometry-msgs message-runtime"

RDEPENDS_${PN} = "actionlib-msgs geometry-msgs message-runtime"

SRC_URI = "https://github.com/ros-gbp/navigation_msgs-release/archive/release/melodic/move_base_msgs/1.13.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e14d25abf910733cf162330337f88aca"
SRC_URI[sha256sum] = "a9b1ee115c3252718a9915a94ba16421a39309ed237a33d790f486d468f8a1ef"

ROS_SPN = "navigation_msgs"
S = "${WORKDIR}/navigation_msgs-release-release-melodic-move_base_msgs-1.13.0-0"

inherit catkin
