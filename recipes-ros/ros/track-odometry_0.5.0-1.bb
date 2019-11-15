DESCRIPTION = "Odometry slip compensation package"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp geometry-msgs message-filters nav-msgs sensor-msgs std-msgs tf2 tf2-geometry-msgs tf2-ros trajectory-msgs neonavigation-common cmake-modules libeigen"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/at-wat/neonavigation-release/archive/release/melodic/track_odometry/0.5.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "38287d3e3998befd8c5b6015568b0ace"
SRC_URI[sha256sum] = "c940bc976d54c2b889facc8658a78df2180bff46a8125187f4588accf6ff8de3"

ROS_SPN = "neonavigation"
S = "${WORKDIR}/neonavigation-release-release-melodic-track_odometry-0.5.0-1"

inherit catkin
