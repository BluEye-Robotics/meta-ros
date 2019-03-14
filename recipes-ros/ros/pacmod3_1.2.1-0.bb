DESCRIPTION = "AutonomouStuff PACMod v3 Driver Package"
AUTHOR = "Joe Driscoll"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "roscpp std-msgs pacmod-msgs can-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/astuff/pacmod3-release/archive/release/melodic/pacmod3/1.2.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d48ed9ead463ecc6f2aad613d470086b"
SRC_URI[sha256sum] = "daff58bf63c7d7e4d76b098f59076691ba3bb27401201eb39681d229ad256bf0"

S = "${WORKDIR}/pacmod3-release-release-melodic-pacmod3-1.2.1-0"

inherit catkin
