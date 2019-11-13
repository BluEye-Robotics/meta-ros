DESCRIPTION = "Node package of the map_distance project. It contains the ROS node that instantiate the distance map plugin."
AUTHOR = "Sai Kishor Kothakota"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "distance-map-core image-geometry"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/artivis/distance_map-release/archive/release/melodic/distance_map_opencv/0.1.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a33375807a2e12589e7402c63500fed6"
SRC_URI[sha256sum] = "391ef19d3ae55b03cdf3e80337d80a73134c2cd1d7fc93fdaf6474bd5c995ca8"

ROS_SPN = "distance_map"
S = "${WORKDIR}/distance_map-release-release-melodic-distance_map_opencv-0.1.0-1"

inherit catkin
