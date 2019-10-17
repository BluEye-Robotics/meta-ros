DESCRIPTION = "Node package of the map_distance project. It contains the ROS node that instantiate the distance map plugin."
AUTHOR = "Jeremie Deray"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "backward-ros distance-map-core interactive-markers visualization-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/artivis/distance_map-release/archive/release/melodic/distance_map_tools/0.1.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ed0611bd2ba69c8c1d855c7edead54e3"
SRC_URI[sha256sum] = "92f4b8ac7e83d90aae1f555aa63ccd8de442b6a6737464c648ab6c0d363d451a"

ROS_SPN = "distance_map"
S = "${WORKDIR}/distance_map-release-release-melodic-distance_map_tools-0.1.0-1"

inherit catkin
