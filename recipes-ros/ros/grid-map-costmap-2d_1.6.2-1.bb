DESCRIPTION = "Interface for grid maps to the costmap_2d format."
AUTHOR = "Péter Fankhauser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "grid-map-core costmap-2d tf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/anybotics/grid_map-release/archive/release/melodic/grid_map_costmap_2d/1.6.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e9523b274446903f63b3a33544da8c8a"
SRC_URI[sha256sum] = "28bb4e0ac05d626c6dc51df229dadf8fa4cc51cdb7d7fae02e252dc6215974c3"

ROS_SPN = "grid_map"
S = "${WORKDIR}/grid_map-release-release-melodic-grid_map_costmap_2d-1.6.2-1"

inherit catkin
