DESCRIPTION = "Configurable tool to visualize grid maps in RViz."
AUTHOR = "Péter Fankhauser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp grid-map-core grid-map-ros grid-map-msgs tf visualization-msgs sensor-msgs nav-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/anybotics/grid_map-release/archive/release/melodic/grid_map_visualization/1.6.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d69f4352e594c6a401a19f13fc927350"
SRC_URI[sha256sum] = "cfb35863409f06d2485133b40720b320bbb76be69fa9bc3b2d54f60aa2333233"

ROS_SPN = "grid_map"
S = "${WORKDIR}/grid_map-release-release-melodic-grid_map_visualization-1.6.2-1"

inherit catkin
