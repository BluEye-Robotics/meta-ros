DESCRIPTION = "Tile map provides a slippy map style interface for visualizing OpenStreetMap and GooleMap tiles. A mapviz visualization plug-in is also implemented"
AUTHOR = "Marc Alban"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libjsoncpp-dev libqt-dev libqt-opengl-dev  mapviz pluginlib roscpp swri-math-util swri-transform-util swri-yaml-util tf"

RDEPENDS_${PN} = "libjsoncpp libqt-core libqt-opengl"

SRC_URI = "https://github.com/swri-robotics-gbp/mapviz-release/archive/release/melodic/tile_map/1.2.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5ba66a99bf9fbaa1fb0b2f3844e501a4"
SRC_URI[sha256sum] = "4a7a37878886851d82c6c26db6664410d798da341bacf6df0818e1e81ad1ae1f"

ROS_SPN = "mapviz"
S = "${WORKDIR}/mapviz-release-release-melodic-tile_map-1.2.0-1"

inherit catkin
