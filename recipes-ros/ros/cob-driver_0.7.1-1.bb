DESCRIPTION = "The cob_driver stack includes packages that provide access to the Care-O-bot hardware through ROS messages, services and actions. E. g. for mobile base, arm, camera sensors, laser scanners, etc. . ."
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "cob-base-drive-chain cob-bms-driver cob-camera-sensors cob-canopen-motor cob-elmo-homing cob-generic-can cob-light cob-mimic cob-phidgets cob-relayboard cob-scan-unifier cob-sick-lms1xx cob-sick-s300 cob-sound cob-undercarriage-ctrl cob-utilities cob-voltage-control"

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_driver/0.7.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d1f1b2c227cf1761f569ca008d0838bb"
SRC_URI[sha256sum] = "82b2d90f8f0d8cd2a4bc31567bcba0dcd10fb992a9564f1b00c492eb2e2cd170"

S = "${WORKDIR}/cob_driver-release-release-melodic-cob_driver-0.7.1-1"

inherit catkin
