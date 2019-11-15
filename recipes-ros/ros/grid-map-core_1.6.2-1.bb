DESCRIPTION = "Universal grid map library to manage two-dimensional grid maps with multiple data layers."
AUTHOR = "Péter Fankhauser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libeigen"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/anybotics/grid_map-release/archive/release/melodic/grid_map_core/1.6.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "06608c1c203fc316ebf804554c259a2c"
SRC_URI[sha256sum] = "b6182772a4ba707cbe209e08bf94790af1710976e43c7d71a770980e3cf376ae"

ROS_SPN = "grid_map"
S = "${WORKDIR}/grid_map-release-release-melodic-grid_map_core-1.6.2-1"

inherit catkin
