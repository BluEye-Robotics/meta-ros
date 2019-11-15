DESCRIPTION = "Path following control package for wheeled mobile robot"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp geometry-msgs interactive-markers nav-msgs tf2 tf2-geometry-msgs tf2-ros libeigen neonavigation-common trajectory-tracker-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/at-wat/neonavigation-release/archive/release/melodic/trajectory_tracker/0.5.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1c2d550e91f636d63be32490e243ce94"
SRC_URI[sha256sum] = "4fbc1a1f8088e1798f2c265414a07faf70f0a4f2352dfdbe77e608e2c0bf76d6"

ROS_SPN = "neonavigation"
S = "${WORKDIR}/neonavigation-release-release-melodic-trajectory_tracker-0.5.0-1"

inherit catkin
