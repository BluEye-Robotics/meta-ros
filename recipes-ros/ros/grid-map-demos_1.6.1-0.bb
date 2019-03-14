DESCRIPTION = "Demo nodes to demonstrate the usage of the grid map library."
AUTHOR = "Péter Fankhauser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp grid-map-core grid-map-ros grid-map-cv grid-map-filters grid-map-loader grid-map-msgs grid-map-octomap grid-map-rviz-plugin grid-map-visualization geometry-msgs sensor-msgs cv-bridge octomap-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/anybotics/grid_map-release/archive/release/melodic/grid_map_demos/1.6.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d352989aecefa002a1c48c2ba3f43742"
SRC_URI[sha256sum] = "b3d00b7333759db2f16c379f918ba9bb9d172292fd31f64c853d8b31b4e21bb7"

ROS_SPN = "grid_map"
S = "${WORKDIR}/grid_map-release-release-melodic-grid_map_demos-1.6.1-0"

inherit catkin
