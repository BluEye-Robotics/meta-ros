DESCRIPTION = "Template based exceptions - these are simple and practical and avoid the proliferation of exception types. Although not syntatactically ideal, it is convenient and eminently practical."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-license ecl-config ecl-errors ecl-license ecl-config ecl-errors"

RDEPENDS_${PN} = "ecl-license ecl-config ecl-errors"

SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/melodic/ecl_exceptions/0.62.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "efa8a730981e89ee843d6af5a3a9dfe7"
SRC_URI[sha256sum] = "41ebe177df444d6184cf296500c419bdac0173c0296d37dfd55110da85216017"

ROS_SPN = "ecl_core"
S = "${WORKDIR}/ecl_core-release-release-melodic-ecl_exceptions-0.62.2-0"

inherit catkin
