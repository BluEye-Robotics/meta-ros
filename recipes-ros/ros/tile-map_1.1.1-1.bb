DESCRIPTION = "Tile map provides a slippy map style interface for visualizing OpenStreetMap and GooleMap tiles. A mapviz visualization plug-in is also implemented"
AUTHOR = "Marc Alban"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libjsoncpp-dev libqt-dev libqt-opengl-dev  mapviz pluginlib roscpp swri-math-util swri-transform-util swri-yaml-util tf"

RDEPENDS_${PN} = "libjsoncpp libqt-core libqt-opengl"

SRC_URI = "https://github.com/swri-robotics-gbp/mapviz-release/archive/release/melodic/tile_map/1.1.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "eb32474a35c6944f40253685ed67d2c9"
SRC_URI[sha256sum] = "87bfd86a1c2d9486b670a33e6e4dae5086281aa23a3e67e4886039706387c5d0"

ROS_SPN = "mapviz"
S = "${WORKDIR}/mapviz-release-release-melodic-tile_map-1.1.1-1"

inherit catkin
