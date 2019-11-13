DESCRIPTION = "visp_hand2eye_calibration estimates the camera position with respect to its effector using the ViSP library."
AUTHOR = "Filip Novotny"
SECTION = "devel"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=fe8b75cf0aba647401e1038bcd69ee74"

DEPENDS = "visp-bridge message-generation image-proc roscpp sensor-msgs std-msgs geometry-msgs visp visp-bridge message-generation message-runtime image-proc roscpp sensor-msgs std-msgs geometry-msgs visp"

RDEPENDS_${PN} = "visp-bridge message-generation message-runtime image-proc roscpp sensor-msgs std-msgs geometry-msgs visp"

SRC_URI = "https://github.com/lagadic/vision_visp-release/archive/release/melodic/visp_hand2eye_calibration/0.11.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1fa5fbb46be1fe435a29ffb2746183dd"
SRC_URI[sha256sum] = "75178b169e63d1052f93e19620f1f25d188948a6944eb55db8d169a33b8f065e"

ROS_SPN = "vision_visp"
S = "${WORKDIR}/vision_visp-release-release-melodic-visp_hand2eye_calibration-0.11.1-1"

inherit catkin
