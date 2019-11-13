DESCRIPTION = "swri_geometry_util"
AUTHOR = "Marc Alban"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules cv-bridge libeigen libgeos++-dev roscpp tf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_geometry_util/2.10.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f98ad3377c898dc4f9c21bed73de660c"
SRC_URI[sha256sum] = "8664691cdaaf752b03e7e6777e794cbfe4480836b09b3be0e1623726b00c8ee5"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_geometry_util-2.10.0-1"

inherit catkin
