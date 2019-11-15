DESCRIPTION = "hector_map_tools contains some functions related to accessing information from OccupancyGridMap maps. Currently consists of a single header."
AUTHOR = "Stefan Kohlbrecher"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "nav-msgs libeigen nav-msgs libeigen"

RDEPENDS_${PN} = "nav-msgs libeigen"

SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_slam-release/archive/release/melodic/hector_map_tools/0.4.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "998fc435a972d8f00f038c1474339ed5"
SRC_URI[sha256sum] = "980e8e3e48bdb9d27e68261ba79d1a55d3b361dcbb55835fa0407854bf5492a1"

ROS_SPN = "hector_slam"
S = "${WORKDIR}/hector_slam-release-release-melodic-hector_map_tools-0.4.0-1"

inherit catkin
