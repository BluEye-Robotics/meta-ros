DESCRIPTION = "Collection of cmake/make build tools primarily for ecl development itself, but also contains a few cmake modules useful outside of the ecl."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-license ecl-license"

RDEPENDS_${PN} = "ecl-license"

SRC_URI = "https://github.com/yujinrobot-release/ecl_tools-release/archive/release/melodic/ecl_build/0.61.8-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "01a6d13eff8e1d2bb69399a05c09884d"
SRC_URI[sha256sum] = "52ff068d6f14f67a9f7a36a7a9974c346db0218c9822d8ac83b29f4ce810dff3"

ROS_SPN = "ecl_tools"
S = "${WORKDIR}/ecl_tools-release-release-melodic-ecl_build-0.61.8-1"

inherit catkin
