DESCRIPTION = "The pilz_industrial_motion package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "pilz-extensions pilz-msgs pilz-trajectory-generation pilz-robot-programming"

SRC_URI = "https://github.com/PilzDE/pilz_industrial_motion-release/archive/release/melodic/pilz_industrial_motion/0.4.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "046dddc3a52c06080a34b2b44a21f7b7"
SRC_URI[sha256sum] = "3a2d7629615033383f22891ecc8116a83fe1dfbfc9c3259aba35b8be5eef2f7b"

S = "${WORKDIR}/pilz_industrial_motion-release-release-melodic-pilz_industrial_motion-0.4.2-0"

inherit catkin
