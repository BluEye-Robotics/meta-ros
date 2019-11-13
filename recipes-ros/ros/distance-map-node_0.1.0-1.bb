DESCRIPTION = "Node package of the map_distance project. It contains the ROS node that instantiate the distance map plugin."
AUTHOR = "Jeremie Deray"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "distance-map-core pluginlib roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/artivis/distance_map-release/archive/release/melodic/distance_map_node/0.1.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "25346c6983105fb27973eb56718539a4"
SRC_URI[sha256sum] = "b46d36b7c07bf2ad49b711846486be9fe3f9fa625d05fa9c3b1445c05f03268c"

ROS_SPN = "distance_map"
S = "${WORKDIR}/distance_map-release-release-melodic-distance_map_node-0.1.0-1"

inherit catkin
