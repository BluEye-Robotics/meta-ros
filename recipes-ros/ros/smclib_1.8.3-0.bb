DESCRIPTION = "The State Machine Compiler (SMC) from http://smc. sourceforge. net/ converts a language-independent description of a state machine into the source code to support that state machine. This package contains the libraries that a compiled state machine depends on, but it does not contain the compiler itself."
AUTHOR = "Various"
SECTION = "devel"
LICENSE = "MPL-1.1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=e1b5a50d4dd59d8102e41a7a2254462d"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/bond_core-release/archive/release/melodic/smclib/1.8.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a33990c20c4375b5ad83689146c19a0c"
SRC_URI[sha256sum] = "a367091ee777853d4a769c98d193b054d176ce84d36a628756970d4495e4d1c0"

ROS_SPN = "bond_core"
S = "${WORKDIR}/bond_core-release-release-melodic-smclib-1.8.3-0"

inherit catkin
