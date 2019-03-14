DESCRIPTION = "ACADO Toolkit"
AUTHOR = "Milan Vukov"
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3460237096e94473a838c16f7071063e"

DEPENDS = "boost boost catkin"

RDEPENDS_${PN} = "boost catkin"

SRC_URI = "https://github.com/tud-cor/acado-release/archive/release/melodic/acado/1.2.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0f14d141759fd4897a0ab07327ac1942"
SRC_URI[sha256sum] = "bfb8864f764eb70aa712553524ee677d50512954cc87bb0a126c2e65bac5dac8"

S = "${WORKDIR}/acado-release-release-melodic-acado-1.2.2-1"

inherit catkin
