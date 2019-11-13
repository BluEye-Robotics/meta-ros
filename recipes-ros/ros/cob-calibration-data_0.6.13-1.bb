DESCRIPTION = "This repository holds the current calibration data for Care-O-bot."
AUTHOR = "Florian Weisshardt"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "cob-supported-robots"

RDEPENDS_${PN} = "xacro"

SRC_URI = "https://github.com/ipa320/cob_calibration_data-release/archive/release/melodic/cob_calibration_data/0.6.13-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0cf0ceb98cb3ff835839e42896d3fa30"
SRC_URI[sha256sum] = "9af7547788449e0127ace2c0c938cfba0efcc3cb874d28769e3864d59f0e9838"

S = "${WORKDIR}/cob_calibration_data-release-release-melodic-cob_calibration_data-0.6.13-1"

inherit catkin
