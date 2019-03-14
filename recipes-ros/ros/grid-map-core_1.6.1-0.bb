DESCRIPTION = "Universal grid map library to manage two-dimensional grid maps with multiple data layers."
AUTHOR = "Péter Fankhauser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libeigen"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/anybotics/grid_map-release/archive/release/melodic/grid_map_core/1.6.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "48c114216a0e8c54638c75a22a6c265c"
SRC_URI[sha256sum] = "9c5d853645c8f9c831857907819f37bb444c328ecdb2d6e948bda548533da03b"

ROS_SPN = "grid_map"
S = "${WORKDIR}/grid_map-release-release-melodic-grid_map_core-1.6.1-0"

inherit catkin
