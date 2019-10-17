DESCRIPTION = "Definition of the distance map message type."
AUTHOR = "Jeremie Deray"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "message-generation nav-msgs std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/artivis/distance_map-release/archive/release/melodic/distance_map_msgs/0.1.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5b1fbaf0954df0e07a900cf07904667d"
SRC_URI[sha256sum] = "6e42332f75de13d580826ac98f1d6ccead3ea761d88f09c0ced6047494abbf39"

ROS_SPN = "distance_map"
S = "${WORKDIR}/distance_map-release-release-melodic-distance_map_msgs-0.1.0-1"

inherit catkin
