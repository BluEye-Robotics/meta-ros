DESCRIPTION = "RotorS control package"
AUTHOR = "Fadri Furrer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=5f4e9e9dcee74b02aa26af144fe2f0af"

DEPENDS = "cmake-modules dynamic-reconfigure geometry-msgs mav-msgs nav-msgs roscpp sensor-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ethz-asl/rotors_simulator-release/archive/release/melodic/rotors_control/2.2.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a7cba684d0e4f71c6915287fea98dd7a"
SRC_URI[sha256sum] = "360134fe15fab3cd01a1869458c0d767006f445a2124532ac6b0c2484e4cc38f"

ROS_SPN = "rotors_simulator"
S = "${WORKDIR}/rotors_simulator-release-release-melodic-rotors_control-2.2.3-0"

inherit catkin
