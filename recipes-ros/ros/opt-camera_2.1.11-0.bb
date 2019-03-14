DESCRIPTION = "opt_camera"
AUTHOR = "Kei Okada"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "sensor-msgs image-proc dynamic-reconfigure camera-calibration-parsers compressed-image-transport cv-bridge rospack roslang sensor-msgs image-proc dynamic-reconfigure camera-calibration-parsers compressed-image-transport cv-bridge rospack"

RDEPENDS_${PN} = "sensor-msgs image-proc dynamic-reconfigure camera-calibration-parsers compressed-image-transport cv-bridge rospack"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/opt_camera/2.1.11-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0bdf8754175faeefecb8472d10934e4a"
SRC_URI[sha256sum] = "57af7e6334d1a87c5da35fc6984d7e35906cbb53c0a9d57d8deb7843aafc9505"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-opt_camera-2.1.11-0"

inherit catkin
