DESCRIPTION = "ROS interface to the 3Dconnexion SpaceNavigator 6DOF joystick."
AUTHOR = "Stuart Glaser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=4;endline=4;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp geometry-msgs sensor-msgs libspnav-dev libx11-dev"

RDEPENDS_${PN} = "spacenavd"

SRC_URI = "https://github.com/ros-gbp/joystick_drivers-release/archive/release/melodic/spacenav_node/1.12.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d3edd8e16a0abc6ff347393c5b524a50"
SRC_URI[sha256sum] = "6b66541475baf7885d88026cb432143520f7ffba8d025c3495d057e26ca76669"

ROS_SPN = "joystick_drivers"
S = "${WORKDIR}/joystick_drivers-release-release-melodic-spacenav_node-1.12.0-0"

inherit catkin
