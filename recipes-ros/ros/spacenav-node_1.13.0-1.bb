DESCRIPTION = "ROS interface to the 3Dconnexion SpaceNavigator 6DOF joystick."
AUTHOR = "Stuart Glaser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=4;endline=4;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp geometry-msgs sensor-msgs libspnav-dev libx11-dev"

RDEPENDS_${PN} = "spacenavd"

SRC_URI = "https://github.com/ros-gbp/joystick_drivers-release/archive/release/melodic/spacenav_node/1.13.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5f447c716f14e5b960d31d59306f3ed9"
SRC_URI[sha256sum] = "91846beae6fc08e6e6cd9a916a334cd026bc702b4d6147781f6d55022c40440c"

ROS_SPN = "joystick_drivers"
S = "${WORKDIR}/joystick_drivers-release-release-melodic-spacenav_node-1.13.0-1"

inherit catkin
