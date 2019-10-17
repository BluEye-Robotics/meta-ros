DESCRIPTION = "Path following control package for wheeled mobile robot"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp geometry-msgs interactive-markers nav-msgs tf2 tf2-geometry-msgs tf2-ros libeigen neonavigation-common trajectory-tracker-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/at-wat/neonavigation-release/archive/release/melodic/trajectory_tracker/0.4.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "28b892ac0382d87bc40c36d5d97a6f2d"
SRC_URI[sha256sum] = "507d82367ace654349b1e6692c6723266f22db5e68fb878fb87399d81b246e4c"

ROS_SPN = "neonavigation"
S = "${WORKDIR}/neonavigation-release-release-melodic-trajectory_tracker-0.4.0-1"

inherit catkin
