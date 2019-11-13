DESCRIPTION = "opt_camera"
AUTHOR = "Kei Okada"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "sensor-msgs image-proc dynamic-reconfigure camera-calibration-parsers compressed-image-transport cv-bridge rospack roslang sensor-msgs image-proc dynamic-reconfigure camera-calibration-parsers compressed-image-transport cv-bridge rospack"

RDEPENDS_${PN} = "sensor-msgs image-proc dynamic-reconfigure camera-calibration-parsers compressed-image-transport cv-bridge rospack"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/opt_camera/2.1.13-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "047d8d239d167a048831fc23fb289593"
SRC_URI[sha256sum] = "f8a97bde5146b272ff34434c5123e0840c30434ecbb076050b7b0e7a5395157e"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-opt_camera-2.1.13-1"

inherit catkin
