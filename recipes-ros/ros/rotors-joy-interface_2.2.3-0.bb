DESCRIPTION = "The rotors_joy_interface package to control MAVs with a joystick"
AUTHOR = "Fadri Furrer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=5f4e9e9dcee74b02aa26af144fe2f0af"

DEPENDS = "sensor-msgs geometry-msgs mav-msgs roscpp trajectory-msgs sensor-msgs geometry-msgs mav-msgs roscpp trajectory-msgs"

RDEPENDS_${PN} = "sensor-msgs geometry-msgs mav-msgs roscpp trajectory-msgs"

SRC_URI = "https://github.com/ethz-asl/rotors_simulator-release/archive/release/melodic/rotors_joy_interface/2.2.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c82ad22f52d44bd99c7839010ca517ff"
SRC_URI[sha256sum] = "ee68f6dbc4f3d3b8b1377de6ceca6113c1d528d5a898c8766c62c0394bfd4db1"

ROS_SPN = "rotors_simulator"
S = "${WORKDIR}/rotors_simulator-release-release-melodic-rotors_joy_interface-2.2.3-0"

inherit catkin
