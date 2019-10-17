DESCRIPTION = "CMake configuration to run coverage"
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "lcov lcov"

RDEPENDS_${PN} = "lcov"

SRC_URI = "https://github.com/mikeferguson/code_coverage-gbp/archive/release/melodic/code_coverage/0.2.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "39223e1a3742879a2ac16f4b1c4b7594"
SRC_URI[sha256sum] = "d5efb8d2d711ff2afaa056c470c4314d3efa3194eaeca1d831a07fac785e4b76"

S = "${WORKDIR}/code_coverage-gbp-release-melodic-code_coverage-0.2.4-1"

inherit catkin
