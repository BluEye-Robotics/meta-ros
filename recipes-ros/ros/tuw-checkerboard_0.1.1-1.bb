DESCRIPTION = "The tuw_checkerboard package is designed to detect one checkerboard and to estimate the pose of the checkerboard relative to the camera. The detection itself is based on the opencv functions for checkerboards."
AUTHOR = "Florian Beck"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cv-bridge dynamic-reconfigure image-geometry image-transport image-view tf marker-msgs dynamic-reconfigure cv-bridge dynamic-reconfigure image-geometry image-transport image-view tf marker-msgs dynamic-reconfigure"

RDEPENDS_${PN} = "cv-bridge dynamic-reconfigure image-geometry image-transport image-view tf marker-msgs dynamic-reconfigure"

SRC_URI = "https://github.com/tuw-robotics/tuw_marker_detection-release/archive/release/melodic/tuw_checkerboard/0.1.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "408e78e156ab69f71288c87d552b62c3"
SRC_URI[sha256sum] = "e7d76c6bb8a14e31094674fc33504b7cca4335d4d0c2362ceda6811633fc483c"

ROS_SPN = "tuw_marker_detection"
S = "${WORKDIR}/tuw_marker_detection-release-release-melodic-tuw_checkerboard-0.1.1-1"

inherit catkin
