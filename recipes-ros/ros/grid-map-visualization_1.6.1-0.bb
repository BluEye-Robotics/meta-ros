DESCRIPTION = "Configurable tool to visualize grid maps in RViz."
AUTHOR = "Péter Fankhauser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp grid-map-core grid-map-ros grid-map-msgs tf visualization-msgs sensor-msgs nav-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/anybotics/grid_map-release/archive/release/melodic/grid_map_visualization/1.6.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0bb68607c428d6d8d309506b8fad8f2f"
SRC_URI[sha256sum] = "c35030b57adc01d75f9d3e5e061c933839f850d7a4d6dbc4d9a0f3fcdd1e0803"

ROS_SPN = "grid_map"
S = "${WORKDIR}/grid_map-release-release-melodic-grid_map_visualization-1.6.1-0"

inherit catkin
