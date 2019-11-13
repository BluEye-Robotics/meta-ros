DESCRIPTION = "The distance_map_core package."
AUTHOR = "Jeremie Deray"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "costmap-2d distance-map-msgs nav-msgs pluginlib roscpp tf2 tf2-geometry-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/artivis/distance_map-release/archive/release/melodic/distance_map_core/0.1.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7b3e25a49ccfb7f76f9600d1a6d668e7"
SRC_URI[sha256sum] = "281115ed9ad36366fedc4b2b84245e907975f598c2ae1a6be6bed67cf5e31b50"

ROS_SPN = "distance_map"
S = "${WORKDIR}/distance_map-release-release-melodic-distance_map_core-0.1.0-1"

inherit catkin
