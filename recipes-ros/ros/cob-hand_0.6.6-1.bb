DESCRIPTION = "The cob_hand stack includes packages that provide access to the Care-O-bot hand through ROS serial."
AUTHOR = "Mathias Lüdtke"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "cob-hand-bridge"

SRC_URI = "https://github.com/ipa320/cob_hand-release/archive/release/melodic/cob_hand/0.6.6-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d7a489ed9f6633512f67d6e3d731c85b"
SRC_URI[sha256sum] = "e4e8632020fc767a075cf34ce674e510adf6594f7c167d0c2d6a31053bba240a"

S = "${WORKDIR}/cob_hand-release-release-melodic-cob_hand-0.6.6-1"

inherit catkin
