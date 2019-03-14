DESCRIPTION = "These tools inspect and describe your system with macros, types and functions."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-license ecl-license ecl-build"

RDEPENDS_${PN} = "ecl-license ecl-build"

SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/melodic/ecl_config/0.61.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "72b803a9e877417825a8582ad550792b"
SRC_URI[sha256sum] = "a8fb8da4c0d398f4f209b8a0f35c738ee3aaca992c8bd3c5d541f60637b83063"

ROS_SPN = "ecl_lite"
S = "${WORKDIR}/ecl_lite-release-release-melodic-ecl_config-0.61.6-0"

inherit catkin
