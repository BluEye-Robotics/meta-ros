DESCRIPTION = "RotorS is a MAV gazebo simulator."
AUTHOR = "Fadri Furrer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=5f4e9e9dcee74b02aa26af144fe2f0af"

DEPENDS = ""

RDEPENDS_${PN} = "rotors-comm rotors-control rotors-description rotors-evaluation rotors-gazebo rotors-gazebo-plugins rotors-hil-interface rotors-joy-interface rqt-rotors"

SRC_URI = "https://github.com/ethz-asl/rotors_simulator-release/archive/release/melodic/rotors_simulator/2.2.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9a6c697b384e3e39ff7ed91c1bfeb8c0"
SRC_URI[sha256sum] = "9d38b7e1ce765500cf43571b367e9c04d2bfe3bcb599ba3de81ac5690b855f58"

S = "${WORKDIR}/rotors_simulator-release-release-melodic-rotors_simulator-2.2.3-0"

inherit catkin
