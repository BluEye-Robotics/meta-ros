DESCRIPTION = "The metapackage"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "prbt-support prbt-ikfast-manipulator-plugin prbt-moveit-config"

SRC_URI = "https://github.com/PilzDE/pilz_robots-release/archive/release/melodic/pilz_robots/0.5.6-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "51911972c7cd3113aa1a1ff0f8bcd004"
SRC_URI[sha256sum] = "36cbcf5405df9df951556a141825523615b782acf2e5a600c4dc73d58ffd5cdb"

S = "${WORKDIR}/pilz_robots-release-release-melodic-pilz_robots-0.5.6-1"

inherit catkin
