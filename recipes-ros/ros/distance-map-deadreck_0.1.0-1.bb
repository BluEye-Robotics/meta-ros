DESCRIPTION = "Node package of the map_distance project. It contains the ROS node that instantiate the distance map plugin."
AUTHOR = "Jeremie Deray"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "distance-map-core"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/artivis/distance_map-release/archive/release/melodic/distance_map_deadreck/0.1.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "67f9868be1a6565fac5498228ce99dd6"
SRC_URI[sha256sum] = "8a15566ebd8f5a596780668824ad86528c57a0649bc8d00de146f124ceae396e"

ROS_SPN = "distance_map"
S = "${WORKDIR}/distance_map-release-release-melodic-distance_map_deadreck-0.1.0-1"

inherit catkin
