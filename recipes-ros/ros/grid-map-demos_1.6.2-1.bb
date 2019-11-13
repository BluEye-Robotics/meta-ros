DESCRIPTION = "Demo nodes to demonstrate the usage of the grid map library."
AUTHOR = "Péter Fankhauser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp grid-map-core grid-map-ros grid-map-cv grid-map-filters grid-map-loader grid-map-msgs grid-map-octomap grid-map-rviz-plugin grid-map-visualization geometry-msgs sensor-msgs cv-bridge octomap-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/anybotics/grid_map-release/archive/release/melodic/grid_map_demos/1.6.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e869fcdedfd0d15276d7eacfd27b9f7d"
SRC_URI[sha256sum] = "54210fb49c552faa381c3dc4ae4ba2d2e8e3af02d35e8ad48bb8b09c209e80ee"

ROS_SPN = "grid_map"
S = "${WORKDIR}/grid_map-release-release-melodic-grid_map_demos-1.6.2-1"

inherit catkin
