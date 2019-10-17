DESCRIPTION = "This package is a substitute for the private implementation of cob_safety_controller package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_substitute-release/archive/release/melodic/cob_safety_controller/0.6.8-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d1cb90886b4388896b5604e550e4748e"
SRC_URI[sha256sum] = "fcb88a994fea2fef7b5606e83f114abf435b37e45919a8d18a684a267b6fa685"

ROS_SPN = "cob_substitute"
S = "${WORKDIR}/cob_substitute-release-release-melodic-cob_safety_controller-0.6.8-1"

inherit catkin
