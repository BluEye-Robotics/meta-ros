DESCRIPTION = "Position feedback controller for simple linear motion of the fetch robot's end-effector."
AUTHOR = "David Kent"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib control-msgs geometry-msgs message-generation roscpp sensor-msgs tf2 tf2-ros tf2-geometry-msgs actionlib control-msgs geometry-msgs message-runtime roscpp sensor-msgs tf2 tf2-ros tf2-geometry-msgs"

RDEPENDS_${PN} = "actionlib control-msgs geometry-msgs message-runtime roscpp sensor-msgs tf2 tf2-ros tf2-geometry-msgs"

SRC_URI = "https://github.com/gt-rail-release/fetch_simple_linear_controller-release/archive/release/melodic/fetch_simple_linear_controller/0.0.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3746a9c9fa6d971dce2c9c661f135f07"
SRC_URI[sha256sum] = "d9479296511f18cc03d51eb3879bd40eb8b3d93fe77c8eb7be34b96d88959ec6"

S = "${WORKDIR}/fetch_simple_linear_controller-release-release-melodic-fetch_simple_linear_controller-0.0.1-1"

inherit catkin
