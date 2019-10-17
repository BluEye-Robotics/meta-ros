DESCRIPTION = "Path following control package for wheeled mobile robot"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp geometry-msgs interactive-markers nav-msgs tf2 tf2-geometry-msgs tf2-ros libeigen neonavigation-common trajectory-tracker-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/at-wat/neonavigation-release/archive/release/melodic/trajectory_tracker/0.4.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5724af2e64d51f5aa09b8b17921f4835"
SRC_URI[sha256sum] = "5497a8d08b3bf8f607dac49b83fed4a693a07fdf2343064abd7ec45cde4c8711"

ROS_SPN = "neonavigation"
S = "${WORKDIR}/neonavigation-release-release-melodic-trajectory_tracker-0.4.3-1"

inherit catkin
