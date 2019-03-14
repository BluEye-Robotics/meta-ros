DESCRIPTION = "This package contains testing utilities used by Pilz packages."
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/PilzDE/pilz_robots-release/archive/release/melodic/pilz_testutils/0.5.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b393f7bf622fedc7ec49c59057d7c209"
SRC_URI[sha256sum] = "0b5fbfa338eb6742e5da883c1e306b0c6e50598aa772c795fc4f092d149bea06"

ROS_SPN = "pilz_robots"
S = "${WORKDIR}/pilz_robots-release-release-melodic-pilz_testutils-0.5.2-0"

inherit catkin
