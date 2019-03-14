DESCRIPTION = "turtle_actionlib demonstrates how to write an action server and client with the turtlesim. The shape_server provides and action interface for drawing regular polygons with the turtlesim."
AUTHOR = "Melonee Wise"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs angles message-generation rosconsole roscpp std-msgs turtlesim geometry-msgs actionlib actionlib-msgs angles message-runtime rosconsole roscpp std-msgs turtlesim geometry-msgs"

RDEPENDS_${PN} = "actionlib actionlib-msgs angles message-runtime rosconsole roscpp std-msgs turtlesim geometry-msgs"

SRC_URI = "https://github.com/ros-gbp/common_tutorials-release/archive/release/melodic/turtle_actionlib/0.1.11-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8dd6fdc5fb70a8cc81f3bd42c96168af"
SRC_URI[sha256sum] = "692d2a6946d45017346aa4165b4331314b1fde5f0067717ce33bf7ebbce1bc94"

ROS_SPN = "common_tutorials"
S = "${WORKDIR}/common_tutorials-release-release-melodic-turtle_actionlib-0.1.11-0"

inherit catkin
