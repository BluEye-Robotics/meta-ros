DESCRIPTION = "Network interfaces and messages."
AUTHOR = "Joshua Whitley"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "message-generation roslint std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/astuff/network_interface-release/archive/release/melodic/network_interface/2.1.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "69dd293365a0e2a788102e28068ed096"
SRC_URI[sha256sum] = "5998b4fc5c5a96474d6a2ab83d3c55f7f5e847af5f909f00176deda4f6612ccf"

S = "${WORKDIR}/network_interface-release-release-melodic-network_interface-2.1.0-0"

inherit catkin
