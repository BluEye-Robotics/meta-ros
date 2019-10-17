DESCRIPTION = "Virtual package providing ViSP related packages."
AUTHOR = "Thomas Moulard"
SECTION = "devel"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=fe8b75cf0aba647401e1038bcd69ee74"

DEPENDS = "visp-auto-tracker visp-bridge visp-camera-calibration visp-hand2eye-calibration visp-tracker"

RDEPENDS_${PN} = "visp-auto-tracker visp-bridge visp-camera-calibration visp-hand2eye-calibration visp-tracker"

SRC_URI = "https://github.com/lagadic/vision_visp-release/archive/release/melodic/vision_visp/0.11.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "124956e4a6c5de922ac56b6afc72691e"
SRC_URI[sha256sum] = "ef04aa5ab2459ab1a2690f7386f223e98c86285200d45fd11f101195550dc1ef"

S = "${WORKDIR}/vision_visp-release-release-melodic-vision_visp-0.11.1-1"

inherit catkin
