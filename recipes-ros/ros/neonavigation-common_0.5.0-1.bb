DESCRIPTION = "Common headers for neonavigation meta-package"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/at-wat/neonavigation-release/archive/release/melodic/neonavigation_common/0.5.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "93bb29c68d03354dd9e30ec966c20d73"
SRC_URI[sha256sum] = "15bc79edb9d6a54775317aafeeca4f8d1c4347d7ba31d57ab4a133356ef24a74"

ROS_SPN = "neonavigation"
S = "${WORKDIR}/neonavigation-release-release-melodic-neonavigation_common-0.5.0-1"

inherit catkin
