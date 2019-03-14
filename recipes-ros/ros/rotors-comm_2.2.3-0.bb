DESCRIPTION = "RotorS specific messages and services."
AUTHOR = "Fadri Furrer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=5f4e9e9dcee74b02aa26af144fe2f0af"

DEPENDS = "cmake-modules geometry-msgs message-generation message-runtime octomap-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ethz-asl/rotors_simulator-release/archive/release/melodic/rotors_comm/2.2.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "47eb5d5258d2dd9e49fbf70eef0b23ef"
SRC_URI[sha256sum] = "6f5fc3033ab80590b10c00fc416c36221be5abd5756b389577e5f3e13dbb346c"

ROS_SPN = "rotors_simulator"
S = "${WORKDIR}/rotors_simulator-release-release-melodic-rotors_comm-2.2.3-0"

inherit catkin
