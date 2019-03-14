DESCRIPTION = "This package provides simple support to cmath, filling in holes or redefining in a c++ formulation where desirable."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-license ecl-type-traits ecl-license ecl-type-traits"

RDEPENDS_${PN} = "ecl-license ecl-type-traits"

SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/melodic/ecl_math/0.62.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "07746693ee95e574d6a82fb8a2879964"
SRC_URI[sha256sum] = "d488ba248dce19a054e54b2054930c7120d2c383c193efc659e8c42714f77dbd"

ROS_SPN = "ecl_core"
S = "${WORKDIR}/ecl_core-release-release-melodic-ecl_math-0.62.2-0"

inherit catkin
