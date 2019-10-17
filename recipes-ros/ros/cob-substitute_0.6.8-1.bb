DESCRIPTION = "cob_substitute"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "cob-docker-control cob-reflector-referencing cob-safety-controller"

SRC_URI = "https://github.com/ipa320/cob_substitute-release/archive/release/melodic/cob_substitute/0.6.8-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3105db0f0eb91579143c6959988bfef6"
SRC_URI[sha256sum] = "39faebf1b1bfabbbe07bbf0054a4417bde87fbd0f8331df06e2a16783a6d50c5"

S = "${WORKDIR}/cob_substitute-release-release-melodic-cob_substitute-0.6.8-1"

inherit catkin
