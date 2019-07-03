DESCRIPTION = "opt_camera"
AUTHOR = "Kei Okada"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "sensor-msgs image-proc dynamic-reconfigure camera-calibration-parsers compressed-image-transport cv-bridge rospack roslang sensor-msgs image-proc dynamic-reconfigure camera-calibration-parsers compressed-image-transport cv-bridge rospack"

RDEPENDS_${PN} = "sensor-msgs image-proc dynamic-reconfigure camera-calibration-parsers compressed-image-transport cv-bridge rospack"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/opt_camera/2.1.12-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0dd44ea18b695b14915719a8450f35c1"
SRC_URI[sha256sum] = "9735161bfb4b2b7cf82d749d0540f5624ab0034286edc102773dad42138e493f"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-opt_camera-2.1.12-2"

inherit catkin
