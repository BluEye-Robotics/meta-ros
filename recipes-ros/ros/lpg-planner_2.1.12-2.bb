DESCRIPTION = "lpg_planner: LPGL Planner (http://zeus. ing. unibs. it/lpg/)"
AUTHOR = "Kei Okada"
SECTION = "devel"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/lpg_planner/2.1.12-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "68624a2f6de9fb44ef5873d4fa2d4f65"
SRC_URI[sha256sum] = "0a59ef2e52c1fbbb106c246831e41ae1c3214abe27e2db594ea6c52c285a0b6c"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-lpg_planner-2.1.12-2"

inherit catkin
