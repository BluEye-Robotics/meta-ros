DESCRIPTION = "libfranka is a C++ library for Franka Emika research robots"
AUTHOR = "Franka Emika GmbH"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "poco libeigen"

RDEPENDS_${PN} = "catkin poco"

SRC_URI = "https://github.com/frankaemika/libfranka-release/archive/release/melodic/libfranka/0.7.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "86f1aacc71666f7c2357e87445967ba6"
SRC_URI[sha256sum] = "1494bbb0fa5f713ad3895f519abb23cf2bbb6a6fddd95cfbf88e7319a1e4688e"

S = "${WORKDIR}/libfranka-release-release-melodic-libfranka-0.7.1-1"

inherit catkin
