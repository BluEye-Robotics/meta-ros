DESCRIPTION = "ACADO Toolkit"
AUTHOR = "Milan Vukov"
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3460237096e94473a838c16f7071063e"

DEPENDS = "boost boost catkin"

RDEPENDS_${PN} = "boost catkin"

SRC_URI = "https://github.com/tud-cor/acado-release/archive/release/melodic/acado/1.2.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bdce9ba4f9a7ca68b91c65be9cdfc6a5"
SRC_URI[sha256sum] = "2d84945378a8f8b6c9d8667b4e1aa02a0001130853e6bb04e29dc1906582598e"

S = "${WORKDIR}/acado-release-release-melodic-acado-1.2.3-0"

inherit catkin
