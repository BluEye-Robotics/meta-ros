DESCRIPTION = "The nanomsg package"
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/yujinrobot-release/nanomsg-release/archive/release/melodic/nanomsg/0.4.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a30dc32d47ac680a715656f47f201bb2"
SRC_URI[sha256sum] = "0b9f6215f091598eac4c7c958693a5b4c8cb09838e18a5b18bc9feb7bf97dfff"

S = "${WORKDIR}/nanomsg-release-release-melodic-nanomsg-0.4.1-0"

inherit catkin
