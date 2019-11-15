DESCRIPTION = "This packagae implements the special homing procedure that is needed for old cob4/raw bases"
AUTHOR = "Mathias Lüdtke"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "canopen-402 pluginlib socketcan-interface"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_elmo_homing/0.7.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a8d7711d7ba1ecce8edcfe9b45a702e5"
SRC_URI[sha256sum] = "031c2209baaab0a5867de7b0ca150fd739251a5383543b0c38c308f91b96cd57"

ROS_SPN = "cob_driver"
S = "${WORKDIR}/cob_driver-release-release-melodic-cob_elmo_homing-0.7.1-1"

inherit catkin
