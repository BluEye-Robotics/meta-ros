DESCRIPTION = "Cross platform filesystem utilities (until c++11 makes its way in)."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-license ecl-build ecl-config ecl-errors ecl-exceptions ecl-license ecl-build ecl-config ecl-errors ecl-exceptions"

RDEPENDS_${PN} = "ecl-license ecl-build ecl-config ecl-errors ecl-exceptions"

SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/melodic/ecl_filesystem/0.62.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e44fa4beae9275a04ee8b2715ea42bee"
SRC_URI[sha256sum] = "7cc4e4aa69ad033c120e3642f512750348e6a15ca373c585e9d3e56a2b75973f"

ROS_SPN = "ecl_core"
S = "${WORKDIR}/ecl_core-release-release-melodic-ecl_filesystem-0.62.2-0"

inherit catkin
