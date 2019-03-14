DESCRIPTION = "The rotors_description package provides URDF models of the AscTec multicopters."
AUTHOR = "Fadri Furrer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=5f4e9e9dcee74b02aa26af144fe2f0af"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ethz-asl/rotors_simulator-release/archive/release/melodic/rotors_description/2.2.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6d20b03cb5d8ca2f5e577d7ff67683c9"
SRC_URI[sha256sum] = "414a6facf153f956359a4bb6faffc2b01b3615b25f5b9b8a0f5141e268a982f1"

ROS_SPN = "rotors_simulator"
S = "${WORKDIR}/rotors_simulator-release-release-melodic-rotors_description-2.2.3-0"

inherit catkin
