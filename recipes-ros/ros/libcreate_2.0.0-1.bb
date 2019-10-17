DESCRIPTION = "C++ library for interfacing with iRobot's Create 1 and Create 2"
AUTHOR = "Jacob Perron"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost"

RDEPENDS_${PN} = "catkin"

SRC_URI = "https://github.com/AutonomyLab/libcreate-release/archive/release/melodic/libcreate/2.0.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6355b12142e517b0b07e9ae541eb03e3"
SRC_URI[sha256sum] = "fe9eba0445a5ca618d3bc223351c7e5df5f12a1576fa671ba8c05dc0b823b35c"

S = "${WORKDIR}/libcreate-release-release-melodic-libcreate-2.0.0-1"

inherit catkin
