DESCRIPTION = "RotorS Hardware-in-the-loop interface package"
AUTHOR = "Pavel Vechersky"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=5f4e9e9dcee74b02aa26af144fe2f0af"

DEPENDS = "cmake-modules geometry-msgs mav-msgs mavros mavros-msgs roscpp sensor-msgs geometry-msgs mav-msgs mavros mavros-msgs roscpp sensor-msgs"

RDEPENDS_${PN} = "geometry-msgs mav-msgs mavros mavros-msgs roscpp sensor-msgs"

SRC_URI = "https://github.com/ethz-asl/rotors_simulator-release/archive/release/melodic/rotors_hil_interface/2.2.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8399120c1cdcc6c67667542bce0970d5"
SRC_URI[sha256sum] = "ee4f035b44afcf982354c3740f05087f5dc9c8f2fffee6816a5e9dc435d46fc5"

ROS_SPN = "rotors_simulator"
S = "${WORKDIR}/rotors_simulator-release-release-melodic-rotors_hil_interface-2.2.3-0"

inherit catkin
