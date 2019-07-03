DESCRIPTION = "Motion limiter package for collision prevention"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp diagnostic-updater geometry-msgs pcl-ros sensor-msgs std-msgs tf2-ros tf2-sensor-msgs neonavigation-common cmake-modules libeigen xmlrpcpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/at-wat/neonavigation-release/archive/release/melodic/safety_limiter/0.4.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "87410d329eeadbac81ddeebb790ffb16"
SRC_URI[sha256sum] = "947c63defcf322b59d4ad07692c8739599eefe00f1b633d1d4dcb1ec4847c1c9"

ROS_SPN = "neonavigation"
S = "${WORKDIR}/neonavigation-release-release-melodic-safety_limiter-0.4.0-1"

inherit catkin
