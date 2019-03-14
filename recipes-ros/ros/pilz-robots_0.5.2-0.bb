DESCRIPTION = "The metapackage"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "prbt-support prbt-ikfast-manipulator-plugin prbt-moveit-config"

SRC_URI = "https://github.com/PilzDE/pilz_robots-release/archive/release/melodic/pilz_robots/0.5.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ef287901d9e8658a4ccbb4b39d6142c1"
SRC_URI[sha256sum] = "848dc98104ae50f81e74c1bfca1e7ce3841af09e0df516317ee23f3414bd10b2"

S = "${WORKDIR}/pilz_robots-release-release-melodic-pilz_robots-0.5.2-0"

inherit catkin
