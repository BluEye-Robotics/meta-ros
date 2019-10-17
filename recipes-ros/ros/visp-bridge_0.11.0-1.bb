DESCRIPTION = "Converts between ROS structures and ViSP structures."
AUTHOR = "Filip Novotny"
SECTION = "devel"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=fe8b75cf0aba647401e1038bcd69ee74"

DEPENDS = "geometry-msgs roscpp sensor-msgs std-msgs visp camera-calibration-parsers geometry-msgs roscpp sensor-msgs std-msgs visp camera-calibration-parsers"

RDEPENDS_${PN} = "geometry-msgs roscpp sensor-msgs std-msgs visp camera-calibration-parsers"

SRC_URI = "https://github.com/lagadic/vision_visp-release/archive/release/melodic/visp_bridge/0.11.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7222c4b8707652d63cce6404a9b3dcbf"
SRC_URI[sha256sum] = "f37cf228e3c36f18aafa38baccba8aef1d6c3f9d3892df3edb32f3256770ff10"

ROS_SPN = "vision_visp"
S = "${WORKDIR}/vision_visp-release-release-melodic-visp_bridge-0.11.0-1"

inherit catkin
