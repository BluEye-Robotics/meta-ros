DESCRIPTION = "The ibeo_core package"
AUTHOR = "Joshua Whitley"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "roslint network-interface"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/astuff/ibeo_core-release/archive/release/melodic/ibeo_core/2.0.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a797367bdd442bfdf63c30c4da8940c8"
SRC_URI[sha256sum] = "c2ee7a2ea9424ee0c40e44d9cf22ab00bface29f418167a42451c6fae071071b"

S = "${WORKDIR}/ibeo_core-release-release-melodic-ibeo_core-2.0.2-0"

inherit catkin
