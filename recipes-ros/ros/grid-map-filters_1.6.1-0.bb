DESCRIPTION = "Processing grid maps as a sequence of ROS filters."
AUTHOR = "Péter Fankhauser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "grid-map-core grid-map-ros grid-map-msgs filters"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/anybotics/grid_map-release/archive/release/melodic/grid_map_filters/1.6.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "efd0f1616e6d941a1d678ad2372a9e73"
SRC_URI[sha256sum] = "b320f6311be2c0c2ad860f9a14b1a0a3bc90e91b3064c33d4736aa7fd3b6188c"

ROS_SPN = "grid_map"
S = "${WORKDIR}/grid_map-release-release-melodic-grid_map_filters-1.6.1-0"

inherit catkin
