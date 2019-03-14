DESCRIPTION = "ROS Package for controlling the AStuff PACMod with a Joystick"
AUTHOR = "Joe Driscoll"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "roscpp std-msgs sensor-msgs pacmod-msgs joy"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/astuff/pacmod_game_control-release/archive/release/melodic/pacmod_game_control/2.3.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "33eae0cd5b6082e748ceb703cad95227"
SRC_URI[sha256sum] = "279a95661041ef6f88cf7ba26f5f61af4010fac0ca579a38eddad0088f6dcabb"

S = "${WORKDIR}/pacmod_game_control-release-release-melodic-pacmod_game_control-2.3.0-0"

inherit catkin
