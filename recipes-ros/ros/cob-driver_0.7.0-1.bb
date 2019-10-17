DESCRIPTION = "The cob_driver stack includes packages that provide access to the Care-O-bot hardware through ROS messages, services and actions. E. g. for mobile base, arm, camera sensors, laser scanners, etc. . ."
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "cob-base-drive-chain cob-bms-driver cob-camera-sensors cob-canopen-motor cob-elmo-homing cob-generic-can cob-light cob-mimic cob-phidgets cob-relayboard cob-scan-unifier cob-sick-lms1xx cob-sick-s300 cob-sound cob-undercarriage-ctrl cob-utilities cob-voltage-control"

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_driver/0.7.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "df901f86ceaf96ed3ef184e45369a27f"
SRC_URI[sha256sum] = "9a63090da04d9813b2fbcd552112f6ef758aeb6ec7b90813f3b00b1982d36db5"

S = "${WORKDIR}/cob_driver-release-release-melodic-cob_driver-0.7.0-1"

inherit catkin
