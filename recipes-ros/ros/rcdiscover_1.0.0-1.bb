DESCRIPTION = "This package contains tools for the discovery of rc_visard sensors via GigE Vision."
AUTHOR = "Heiko Hirschmueller"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "catkin"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/roboception-gbp/rcdiscover-release/archive/release/melodic/rcdiscover/1.0.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7b4005a6732c39a2c925580488c47e25"
SRC_URI[sha256sum] = "43fdfa6280e76ad07d45bf32e7e1e08ee91f161bfef9605765758ef8a51e5b13"

S = "${WORKDIR}/rcdiscover-release-release-melodic-rcdiscover-1.0.0-1"

inherit catkin
