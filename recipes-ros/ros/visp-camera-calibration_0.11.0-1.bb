DESCRIPTION = "visp_camera_calibration allows easy calibration of cameras using a customizable pattern and ViSP library."
AUTHOR = "Filip Novotny"
SECTION = "devel"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=fe8b75cf0aba647401e1038bcd69ee74"

DEPENDS = "camera-calibration-parsers geometry-msgs message-generation roscpp sensor-msgs std-msgs visp visp-bridge camera-calibration-parsers geometry-msgs message-generation message-runtime roscpp sensor-msgs std-msgs visp visp-bridge"

RDEPENDS_${PN} = "camera-calibration-parsers geometry-msgs message-generation message-runtime roscpp sensor-msgs std-msgs visp visp-bridge"

SRC_URI = "https://github.com/lagadic/vision_visp-release/archive/release/melodic/visp_camera_calibration/0.11.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7442f004d684d01aadae6bdc19a4518c"
SRC_URI[sha256sum] = "d31f9266dceea12a92472f97047240dc99f633794a57ecc870a660280f172553"

ROS_SPN = "vision_visp"
S = "${WORKDIR}/vision_visp-release-release-melodic-visp_camera_calibration-0.11.0-1"

inherit catkin
