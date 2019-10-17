DESCRIPTION = "Collection of cmake/make build tools primarily for ecl development itself, but also contains a few cmake modules useful outside of the ecl."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-license ecl-license"

RDEPENDS_${PN} = "ecl-license"

SRC_URI = "https://github.com/yujinrobot-release/ecl_tools-release/archive/release/melodic/ecl_build/0.61.7-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "97b802f1277df951b7fea53379545472"
SRC_URI[sha256sum] = "6133fdac73fbedffae19ec5ec6b203225f7e8db9ac1d88fca425d95dc97beae4"

ROS_SPN = "ecl_tools"
S = "${WORKDIR}/ecl_tools-release-release-melodic-ecl_build-0.61.7-0"

inherit catkin
