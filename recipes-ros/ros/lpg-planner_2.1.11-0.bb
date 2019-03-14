DESCRIPTION = "lpg_planner: LPGL Planner (http://zeus. ing. unibs. it/lpg/)"
AUTHOR = "Kei Okada"
SECTION = "devel"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/lpg_planner/2.1.11-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ca0a1d307c1901f1c836b8b62f8bd7da"
SRC_URI[sha256sum] = "3b0bcbc42885a9c57b78f21644ea52ef39c14e74b4874f0aafd2ea7222a31344"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-lpg_planner-2.1.11-0"

inherit catkin
