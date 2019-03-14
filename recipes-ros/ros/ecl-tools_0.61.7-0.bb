DESCRIPTION = "Tools and utilities for ecl development."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-license ecl-build"

RDEPENDS_${PN} = "ecl-license ecl-build"

SRC_URI = "https://github.com/yujinrobot-release/ecl_tools-release/archive/release/melodic/ecl_tools/0.61.7-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "db5ffce6f717cf3a4cb70bd2d75a9d8e"
SRC_URI[sha256sum] = "fb2e777278b4eb2dfbbcb47117e69e6ee417375041ff731d7ffca1ab1c5c6c43"

S = "${WORKDIR}/ecl_tools-release-release-melodic-ecl_tools-0.61.7-0"

inherit catkin
