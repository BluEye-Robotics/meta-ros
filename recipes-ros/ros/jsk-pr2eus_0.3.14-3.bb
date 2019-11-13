DESCRIPTION = ""
AUTHOR = "Kei Okada"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "pr2eus"

RDEPENDS_${PN} = "pr2eus"

SRC_URI = "https://github.com/tork-a/jsk_pr2eus-release/archive/release/melodic/jsk_pr2eus/0.3.14-3.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4ee73ba4189ceec918a912f8cbd72a1b"
SRC_URI[sha256sum] = "bfe20ebd5febc154b2a7e052f41900e4eaf4f11890d79dc0428facf06fb855b8"

S = "${WORKDIR}/jsk_pr2eus-release-release-melodic-jsk_pr2eus-0.3.14-3"

inherit catkin
