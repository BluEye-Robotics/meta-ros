DESCRIPTION = "visp_camera_calibration allows easy calibration of cameras using a customizable pattern and ViSP library."
AUTHOR = "Filip Novotny"
SECTION = "devel"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=fe8b75cf0aba647401e1038bcd69ee74"

DEPENDS = "camera-calibration-parsers geometry-msgs message-generation roscpp sensor-msgs std-msgs visp visp-bridge camera-calibration-parsers geometry-msgs message-generation message-runtime roscpp sensor-msgs std-msgs visp visp-bridge"

RDEPENDS_${PN} = "camera-calibration-parsers geometry-msgs message-generation message-runtime roscpp sensor-msgs std-msgs visp visp-bridge"

SRC_URI = "https://github.com/lagadic/vision_visp-release/archive/release/melodic/visp_camera_calibration/0.11.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "649e67e2039c25bb84fcf9e2f87105e6"
SRC_URI[sha256sum] = "ad0ec2a1443b13767d73f4e5769b764e1046498ad93b94c65454687e4ed574c0"

ROS_SPN = "vision_visp"
S = "${WORKDIR}/vision_visp-release-release-melodic-visp_camera_calibration-0.11.1-1"

inherit catkin
