DESCRIPTION = "This packagae implements the special homing procedure that is needed for old cob4/raw bases"
AUTHOR = "Mathias Lüdtke"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "canopen-402 class-loader socketcan-interface"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_elmo_homing/0.7.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "941db01f988698ad4a8fc316dda5ca95"
SRC_URI[sha256sum] = "1fe6ad515900832d095a352303a0dffbd7d5fb15afc15bd963f370c64f1f7a8e"

ROS_SPN = "cob_driver"
S = "${WORKDIR}/cob_driver-release-release-melodic-cob_elmo_homing-0.7.0-1"

inherit catkin
