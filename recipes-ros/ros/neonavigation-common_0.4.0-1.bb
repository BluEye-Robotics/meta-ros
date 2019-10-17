DESCRIPTION = "Common headers for neonavigation meta-package"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/at-wat/neonavigation-release/archive/release/melodic/neonavigation_common/0.4.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7f6916c9b3c69479412ed0712b85add1"
SRC_URI[sha256sum] = "484997619363c6f509e2c477f864d68964accc3fc5655064578830876947a028"

ROS_SPN = "neonavigation"
S = "${WORKDIR}/neonavigation-release-release-melodic-neonavigation_common-0.4.0-1"

inherit catkin
