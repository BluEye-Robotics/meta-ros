DESCRIPTION = "Odometry slip compensation package"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp geometry-msgs message-filters nav-msgs sensor-msgs std-msgs tf2 tf2-geometry-msgs tf2-ros trajectory-msgs neonavigation-common cmake-modules libeigen"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/at-wat/neonavigation-release/archive/release/melodic/track_odometry/0.4.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0ea969667783677151d7be3d5a29bded"
SRC_URI[sha256sum] = "bf51655c5fc35af24eb610e976abdada00653ab09f28c2c0f7a65b420743ae72"

ROS_SPN = "neonavigation"
S = "${WORKDIR}/neonavigation-release-release-melodic-track_odometry-0.4.3-1"

inherit catkin
