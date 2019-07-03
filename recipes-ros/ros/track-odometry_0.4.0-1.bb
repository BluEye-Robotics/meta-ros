DESCRIPTION = "Odometry slip compensation package"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp geometry-msgs nav-msgs sensor-msgs std-msgs tf2 tf2-geometry-msgs tf2-ros trajectory-msgs neonavigation-common cmake-modules libeigen"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/at-wat/neonavigation-release/archive/release/melodic/track_odometry/0.4.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0308b529862638ba86fae848408dd3ff"
SRC_URI[sha256sum] = "37d0cf18734eb59cddb99b48f75539c533df70343d9cc3897c7c512992986db0"

ROS_SPN = "neonavigation"
S = "${WORKDIR}/neonavigation-release-release-melodic-track_odometry-0.4.0-1"

inherit catkin
