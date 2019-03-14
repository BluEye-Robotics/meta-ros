DESCRIPTION = "The rqt_rotors package"
AUTHOR = "Pavel Vechersky"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=5f4e9e9dcee74b02aa26af144fe2f0af"

DEPENDS = "mavros-msgs rospy rqt-gui-py rqt-gui"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ethz-asl/rotors_simulator-release/archive/release/melodic/rqt_rotors/2.2.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "507655a02fdc2841f96204092c59f109"
SRC_URI[sha256sum] = "fd26afa06f8f7acd5dcc50aeab04521d73b266f1b921150cdd675cdf62a9c840"

ROS_SPN = "rotors_simulator"
S = "${WORKDIR}/rotors_simulator-release-release-melodic-rqt_rotors-2.2.3-0"

inherit catkin
