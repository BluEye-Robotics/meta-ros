DESCRIPTION = "Color codes for ansii consoles."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-license ecl-build ecl-config ecl-license ecl-build ecl-config"

RDEPENDS_${PN} = "ecl-license ecl-build ecl-config"

SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/melodic/ecl_console/0.61.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e28762429497c16e5e6a04719b343615"
SRC_URI[sha256sum] = "5586ad3bb23b745e301fb78ddc22ae1125f5b0c559d93e39b9c832ca2307557b"

ROS_SPN = "ecl_lite"
S = "${WORKDIR}/ecl_lite-release-release-melodic-ecl_console-0.61.6-0"

inherit catkin
