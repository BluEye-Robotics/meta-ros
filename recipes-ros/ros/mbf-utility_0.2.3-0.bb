DESCRIPTION = "The mbf_utility package"
AUTHOR = "Sebastian Pütz"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs roscpp tf tf2 tf2-ros tf2-geometry-msgs geometry-msgs roscpp tf"

RDEPENDS_${PN} = "geometry-msgs roscpp tf"

SRC_URI = "https://github.com/uos-gbp/move_base_flex-release/archive/release/melodic/mbf_utility/0.2.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c689c8db957b162d566904aa484cd0e9"
SRC_URI[sha256sum] = "7bd062652a4d93996bf5c705a3a02bf2506313a2c99993d0efd89210bd7fd5bf"

ROS_SPN = "move_base_flex"
S = "${WORKDIR}/move_base_flex-release-release-melodic-mbf_utility-0.2.3-0"

inherit catkin
