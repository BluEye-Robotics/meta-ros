DESCRIPTION = "This package allows you to publish the state of a robot to"
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=23;endline=23;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libeigen kdl-parser orocos-kdl rosconsole roscpp rostime sensor-msgs tf tf2-ros tf2-kdl urdfdom-headers catkin libeigen kdl-parser orocos-kdl rosconsole roscpp rostime sensor-msgs tf tf2-ros tf2-kdl"

RDEPENDS_${PN} = "catkin libeigen kdl-parser orocos-kdl rosconsole roscpp rostime sensor-msgs tf tf2-ros tf2-kdl"

SRC_URI = "https://github.com/ros-gbp/robot_state_publisher-release/archive/release/melodic/robot_state_publisher/1.14.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c5cb4a2cb8c5668bfe740f89d0ab14a1"
SRC_URI[sha256sum] = "e80bd4391f22b6a8817f78c36ecfa37cf9e2161a9909f027a6516bcd7a6be10a"

S = "${WORKDIR}/robot_state_publisher-release-release-melodic-robot_state_publisher-1.14.0-1"

inherit catkin
