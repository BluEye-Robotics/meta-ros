DESCRIPTION = "The dataset evaluation package for the RotorS simulator."
AUTHOR = "Fadri Furrer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=5f4e9e9dcee74b02aa26af144fe2f0af"

DEPENDS = "rospy"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ethz-asl/rotors_simulator-release/archive/release/melodic/rotors_evaluation/2.2.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "723e91070ac9841db84787b262433f73"
SRC_URI[sha256sum] = "01b472150f0c2e6250cfb8db3a04a66d23c16c987d3f95900be335c64b9886e7"

ROS_SPN = "rotors_simulator"
S = "${WORKDIR}/rotors_simulator-release-release-melodic-rotors_evaluation-2.2.3-0"

inherit catkin
