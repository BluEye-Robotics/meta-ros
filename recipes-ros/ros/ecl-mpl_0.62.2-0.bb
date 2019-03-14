DESCRIPTION = "Metaprogramming tools move alot of runtime calculations to be shifted to compile time. This has only very elementary structures at this stage."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-license ecl-license"

RDEPENDS_${PN} = "ecl-license"

SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/melodic/ecl_mpl/0.62.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b55bfb7dd45eaa50e90610d6e7b7f3db"
SRC_URI[sha256sum] = "b0d2d0c068130287e3f8bc5d6e0fcf93cc5a5cefb02e2a8432504557dc411e46"

ROS_SPN = "ecl_core"
S = "${WORKDIR}/ecl_core-release-release-melodic-ecl_mpl-0.62.2-0"

inherit catkin
