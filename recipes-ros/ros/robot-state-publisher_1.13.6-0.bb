DESCRIPTION = "This package allows you to publish the state of a robot to"
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=22;endline=22;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libeigen kdl-parser orocos-kdl rosconsole roscpp rostime sensor-msgs tf tf2-ros tf2-kdl urdfdom-headers catkin libeigen kdl-parser orocos-kdl rosconsole roscpp rostime sensor-msgs tf tf2-ros tf2-kdl"

RDEPENDS_${PN} = "catkin libeigen kdl-parser orocos-kdl rosconsole roscpp rostime sensor-msgs tf tf2-ros tf2-kdl"

SRC_URI = "https://github.com/ros-gbp/robot_state_publisher-release/archive/release/melodic/robot_state_publisher/1.13.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cfe903234cff283086ae1cf213a1f639"
SRC_URI[sha256sum] = "6c7097ebd829c690bd5b55296eb4b48ae434f2c75c0e20647f78e716aa56dd74"

S = "${WORKDIR}/robot_state_publisher-release-release-melodic-robot_state_publisher-1.13.6-0"

inherit catkin
