DESCRIPTION = "visp_hand2eye_calibration estimates the camera position with respect to its effector using the ViSP library."
AUTHOR = "Filip Novotny"
SECTION = "devel"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=fe8b75cf0aba647401e1038bcd69ee74"

DEPENDS = "visp-bridge message-generation image-proc roscpp sensor-msgs std-msgs geometry-msgs visp visp-bridge message-generation message-runtime image-proc roscpp sensor-msgs std-msgs geometry-msgs visp"

RDEPENDS_${PN} = "visp-bridge message-generation message-runtime image-proc roscpp sensor-msgs std-msgs geometry-msgs visp"

SRC_URI = "https://github.com/lagadic/vision_visp-release/archive/release/melodic/visp_hand2eye_calibration/0.11.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8f8280a12d0c8ceb25d3db76795ecb0b"
SRC_URI[sha256sum] = "60754feb035184e9c3b665524b9be1fb8c086962b5fce59052f9cd7d6d3af618"

ROS_SPN = "vision_visp"
S = "${WORKDIR}/vision_visp-release-release-melodic-visp_hand2eye_calibration-0.11.0-1"

inherit catkin
