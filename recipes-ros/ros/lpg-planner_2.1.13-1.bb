DESCRIPTION = "lpg_planner: LPGL Planner (http://zeus. ing. unibs. it/lpg/)"
AUTHOR = "Kei Okada"
SECTION = "devel"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/lpg_planner/2.1.13-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cfb3facc70276d737006590d1f03691b"
SRC_URI[sha256sum] = "f98b7efbbf8c0642c3e12eec4a3a73c912f58647e674d04adfa6ea11a2f1d14f"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-lpg_planner-2.1.13-1"

inherit catkin
