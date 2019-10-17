DESCRIPTION = "The distance_map metapackage"
AUTHOR = "Jeremie Deray"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = ""

RDEPENDS_${PN} = "distance-map-core distance-map-msgs distance-map-node distance-map-rviz distance-map-tools distance-map-opencv distance-map-deadreck"

SRC_URI = "https://github.com/artivis/distance_map-release/archive/release/melodic/distance_map/0.1.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a7eaaf219566dbda7e097a628a1178c1"
SRC_URI[sha256sum] = "262190723b5fa17407d598707e424582868c71fa6848ecf408d7208ecb2b74d1"

S = "${WORKDIR}/distance_map-release-release-melodic-distance_map-0.1.0-1"

inherit catkin
