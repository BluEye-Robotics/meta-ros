DESCRIPTION = "The pilz_industrial_motion package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "pilz-extensions pilz-msgs pilz-trajectory-generation pilz-robot-programming"

SRC_URI = "https://github.com/PilzDE/pilz_industrial_motion-release/archive/release/melodic/pilz_industrial_motion/0.4.7-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "210f4a86e4b437797847dfb23cb37106"
SRC_URI[sha256sum] = "a67040107be2808dcfcee17019da8eea3af18468d1a42e34f364fdb21ca6c80e"

S = "${WORKDIR}/pilz_industrial_motion-release-release-melodic-pilz_industrial_motion-0.4.7-1"

inherit catkin
