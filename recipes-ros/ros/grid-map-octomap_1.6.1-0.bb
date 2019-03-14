DESCRIPTION = "Conversions between grid maps and OctoMap types."
AUTHOR = "Jeff Delmerico"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "grid-map-core octomap"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/anybotics/grid_map-release/archive/release/melodic/grid_map_octomap/1.6.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "43796696aa9dc629610caba04f025001"
SRC_URI[sha256sum] = "b21ce231c7f9c9bb20d94c48d608be6b1e0d640067542de8570227eef05cd520"

ROS_SPN = "grid_map"
S = "${WORKDIR}/grid_map-release-release-melodic-grid_map_octomap-1.6.1-0"

inherit catkin
