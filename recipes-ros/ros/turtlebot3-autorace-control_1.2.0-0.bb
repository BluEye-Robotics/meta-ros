DESCRIPTION = "TurtleBot3 AutoRace ROS package that controls TurtleBot3 Auto"
AUTHOR = "Gilbert"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "rospy std-msgs sensor-msgs geometry-msgs nav-msgs tf python-numpy python-enum34"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3_autorace-release/archive/release/melodic/turtlebot3_autorace_control/1.2.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e1f73b683960545301440ef46e4b0f13"
SRC_URI[sha256sum] = "b56c3c0c52ea3cffbbca2e86a6236f6a8a0520edc2c8178682c1e0dda35dfd94"

ROS_SPN = "turtlebot3_autorace"
S = "${WORKDIR}/turtlebot3_autorace-release-release-melodic-turtlebot3_autorace_control-1.2.0-0"

inherit catkin
