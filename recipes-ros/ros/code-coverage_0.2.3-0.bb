DESCRIPTION = "CMake configuration to run coverage"
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "lcov lcov"

RDEPENDS_${PN} = "lcov"

SRC_URI = "https://github.com/mikeferguson/code_coverage-gbp/archive/release/melodic/code_coverage/0.2.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e2292ee3345fda73c9e6e3d1fccd0e56"
SRC_URI[sha256sum] = "aaf9d0b3b00d1b1af932e9099dbb3a92475ee92e45f189b3bfb3559e8abb1c50"

S = "${WORKDIR}/code_coverage-gbp-release-melodic-code_coverage-0.2.3-0"

inherit catkin
