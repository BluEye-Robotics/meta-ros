DESCRIPTION = "This repository holds the current calibration data for Care-O-bot."
AUTHOR = "Florian Weisshardt"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "cob-supported-robots"

RDEPENDS_${PN} = "xacro"

SRC_URI = "https://github.com/ipa320/cob_calibration_data-release/archive/release/melodic/cob_calibration_data/0.6.12-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7a0a72d93dfc44d94456ba3da0ba6464"
SRC_URI[sha256sum] = "68415a57396e9fb774137d2aefad2c825fc33745a54a0b674bc69384660bede7"

S = "${WORKDIR}/cob_calibration_data-release-release-melodic-cob_calibration_data-0.6.12-1"

inherit catkin
