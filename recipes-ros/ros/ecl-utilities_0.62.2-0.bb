DESCRIPTION = "Includes various supporting tools and utilities for c++ programming."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-license ecl-mpl ecl-concepts ecl-license ecl-mpl ecl-concepts"

RDEPENDS_${PN} = "ecl-license ecl-mpl ecl-concepts"

SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/melodic/ecl_utilities/0.62.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5ba34d2f7752110dc834c8281949cfcc"
SRC_URI[sha256sum] = "4e3ab2bd3246bbda3763e850f949bac0dcd3988bf5ec5269563bd4906ad23bdd"

ROS_SPN = "ecl_core"
S = "${WORKDIR}/ecl_core-release-release-melodic-ecl_utilities-0.62.2-0"

inherit catkin
