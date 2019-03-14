DESCRIPTION = "The rotors_gazebo package"
AUTHOR = "Fadri Furrer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=5f4e9e9dcee74b02aa26af144fe2f0af"

DEPENDS = "gazebo-msgs gazebo-plugins geometry-msgs joy mav-msgs roscpp rotors-gazebo-plugins sensor-msgs xacro"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ethz-asl/rotors_simulator-release/archive/release/melodic/rotors_gazebo/2.2.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2a9548118323ef2ce2c1e4821a4ddc03"
SRC_URI[sha256sum] = "98425c45ee4f84bc43c033c786ad18ea897efda6616cca43f24ad38b3cc5083b"

ROS_SPN = "rotors_simulator"
S = "${WORKDIR}/rotors_simulator-release-release-melodic-rotors_gazebo-2.2.3-0"

inherit catkin
