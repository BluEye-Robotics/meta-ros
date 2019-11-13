DESCRIPTION = "ROS Networking Autoconfiguration"
AUTHOR = ""
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = ""

RDEPENDS_${PN} = "network-manager"

SRC_URI = "https://github.com/LucidOne-release/network_autoconfig/archive/release/melodic/network_autoconfig/0.1.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a5f46a7fd9ef4bc7f4b03d4a35e45828"
SRC_URI[sha256sum] = "7be2b646f3f35fb4dbb3060150cadf0487a6ece2cb5985650088c22cf6aa1747"

S = "${WORKDIR}/network_autoconfig-release-melodic-network_autoconfig-0.1.1-1"

inherit catkin
