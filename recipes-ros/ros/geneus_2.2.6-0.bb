DESCRIPTION = "EusLisp ROS message and service generators."
AUTHOR = "Kei Okada"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "genmsg genmsg"

RDEPENDS_${PN} = "genmsg"

SRC_URI = "https://github.com/tork-a/geneus-release/archive/release/melodic/geneus/2.2.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6b86a8f574359869529f9d224e3c1794"
SRC_URI[sha256sum] = "aadb96f7266f5584813ea6033317b1decf6a7358d01cf257239ae4c04ffb67c6"

S = "${WORKDIR}/geneus-release-release-melodic-geneus-2.2.6-0"

inherit catkin
