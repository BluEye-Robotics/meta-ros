DESCRIPTION = "Metapackage bringing all of ecl together."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-tools ecl-lite ecl-core ecl-navigation ecl-manipulation"

RDEPENDS_${PN} = "ecl-tools ecl-lite ecl-core ecl-navigation ecl-manipulation"

SRC_URI = "https://github.com/yujinrobot-release/ecl_manipulation-release/archive/release/melodic/ecl/0.60.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6f865f9ec47802cd840a6fc378e158a9"
SRC_URI[sha256sum] = "bbcf9a596091fbf4158e2593c652fe8329338bcf39ab3258abc93f4ac42289ae"

ROS_SPN = "ecl_manipulation"
S = "${WORKDIR}/ecl_manipulation-release-release-melodic-ecl-0.60.3-0"

inherit catkin
