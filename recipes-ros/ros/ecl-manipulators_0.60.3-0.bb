DESCRIPTION = "Deploys various manipulation algorithms, currently just feedforward filters (interpolations)."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-license ecl-exceptions ecl-geometry ecl-formatters ecl-build ecl-license ecl-exceptions ecl-geometry ecl-formatters"

RDEPENDS_${PN} = "ecl-build ecl-license ecl-exceptions ecl-geometry ecl-formatters"

SRC_URI = "https://github.com/yujinrobot-release/ecl_manipulation-release/archive/release/melodic/ecl_manipulators/0.60.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f37916e257789a21752781264ddcef36"
SRC_URI[sha256sum] = "29d59a85307ce361a71f362a25d9b1ff94aaafd5a2df8a51d0659f74d3d735d9"

ROS_SPN = "ecl_manipulation"
S = "${WORKDIR}/ecl_manipulation-release-release-melodic-ecl_manipulators-0.60.3-0"

inherit catkin
