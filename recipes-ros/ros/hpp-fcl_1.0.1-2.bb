DESCRIPTION = "HPP fork of FCL with bug fixes."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "git octomap libeigen boost assimp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipab-slmc/hpp-fcl_catkin-release/archive/release/melodic/hpp-fcl/1.0.1-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "80497b2c83638ecd3c92e82a02e66511"
SRC_URI[sha256sum] = "f6c9669e0b2cf9cbc04bfc89014ae8a82b0895e65eec29d65ca557ca6d375a41"

S = "${WORKDIR}/hpp-fcl_catkin-release-release-melodic-hpp-fcl-1.0.1-2"

inherit catkin
