DESCRIPTION = "Virtual package providing ViSP related packages."
AUTHOR = "Thomas Moulard"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "visp-auto-tracker visp-bridge visp-camera-calibration visp-hand2eye-calibration visp-tracker"

RDEPENDS_${PN} = "visp-auto-tracker visp-bridge visp-camera-calibration visp-hand2eye-calibration visp-tracker"

SRC_URI = "https://github.com/lagadic/vision_visp-release/archive/release/melodic/vision_visp/0.11.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fb4ee99374f9ac33847a1a29fa861f61"
SRC_URI[sha256sum] = "761ae567a610fbfafa40a71b9cd58e9e88b6e94b1b1dabae556b5ebecb94e2c7"

S = "${WORKDIR}/vision_visp-release-release-melodic-vision_visp-0.11.0-1"

inherit catkin
