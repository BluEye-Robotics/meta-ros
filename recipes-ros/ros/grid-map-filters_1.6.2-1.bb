DESCRIPTION = "Processing grid maps as a sequence of ROS filters."
AUTHOR = "Péter Fankhauser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "grid-map-core grid-map-ros grid-map-msgs filters"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/anybotics/grid_map-release/archive/release/melodic/grid_map_filters/1.6.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5eea9d234c3c1909b640dd7390b5c3ba"
SRC_URI[sha256sum] = "fbcfe4d877776fa98992e64c6d6dfe8c0095842f46012c21778149eae702ab90"

ROS_SPN = "grid_map"
S = "${WORKDIR}/grid_map-release-release-melodic-grid_map_filters-1.6.2-1"

inherit catkin
