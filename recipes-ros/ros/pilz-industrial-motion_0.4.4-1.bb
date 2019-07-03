DESCRIPTION = "The pilz_industrial_motion package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "pilz-extensions pilz-msgs pilz-trajectory-generation pilz-robot-programming"

SRC_URI = "https://github.com/PilzDE/pilz_industrial_motion-release/archive/release/melodic/pilz_industrial_motion/0.4.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7bcb2b8b415a67a351af6787166676b2"
SRC_URI[sha256sum] = "575bfa5f2b503147017022cabb5c55a0c835129d2ee34c47b52b9f9e50632c67"

S = "${WORKDIR}/pilz_industrial_motion-release-release-melodic-pilz_industrial_motion-0.4.4-1"

inherit catkin
