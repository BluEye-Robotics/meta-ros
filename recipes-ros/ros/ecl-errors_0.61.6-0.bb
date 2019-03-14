DESCRIPTION = "This library provides lean and mean error mechanisms. It includes c style error functions as well as a few useful macros. For higher level mechanisms, refer to ecl_exceptions."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-license ecl-config ecl-license ecl-config"

RDEPENDS_${PN} = "ecl-license ecl-config"

SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/melodic/ecl_errors/0.61.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a1a454bd9b467455abc9449714ef62d4"
SRC_URI[sha256sum] = "e41cdee101ab35c2963fc8e080294f597646006e246cae31242898b1b69e4eb9"

ROS_SPN = "ecl_lite"
S = "${WORKDIR}/ecl_lite-release-release-melodic-ecl_errors-0.61.6-0"

inherit catkin
