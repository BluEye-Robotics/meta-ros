DESCRIPTION = "Tile map provides a slippy map style interface for visualizing OpenStreetMap and GooleMap tiles. A mapviz visualization plug-in is also implemented"
AUTHOR = "Marc Alban"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libjsoncpp-dev libqt-dev libqt-opengl-dev  mapviz pluginlib roscpp swri-math-util swri-transform-util swri-yaml-util tf"

RDEPENDS_${PN} = "libjsoncpp libqt-core libqt-opengl"

SRC_URI = "https://github.com/swri-robotics-gbp/mapviz-release/archive/release/melodic/tile_map/1.1.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b52b983bb283e918865358f38e5f1009"
SRC_URI[sha256sum] = "1c07be1cd9cc43bf83905aad8ca0ab00072857482342ff7e7416cf2031a46ad8"

ROS_SPN = "mapviz"
S = "${WORKDIR}/mapviz-release-release-melodic-tile_map-1.1.0-0"

inherit catkin
