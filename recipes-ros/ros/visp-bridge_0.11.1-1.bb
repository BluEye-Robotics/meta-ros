DESCRIPTION = "Converts between ROS structures and ViSP structures."
AUTHOR = "Filip Novotny"
SECTION = "devel"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=fe8b75cf0aba647401e1038bcd69ee74"

DEPENDS = "geometry-msgs roscpp sensor-msgs std-msgs visp camera-calibration-parsers geometry-msgs roscpp sensor-msgs std-msgs visp camera-calibration-parsers"

RDEPENDS_${PN} = "geometry-msgs roscpp sensor-msgs std-msgs visp camera-calibration-parsers"

SRC_URI = "https://github.com/lagadic/vision_visp-release/archive/release/melodic/visp_bridge/0.11.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "09364f0776e5c9e083908ec8c8d8e6d0"
SRC_URI[sha256sum] = "fb3c65629562f788a601202f916a03a96138bb1486aa6f14b26d798261303f62"

ROS_SPN = "vision_visp"
S = "${WORKDIR}/vision_visp-release-release-melodic-visp_bridge-0.11.1-1"

inherit catkin
