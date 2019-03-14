DESCRIPTION = "An"
AUTHOR = "Alexander W. Winkler"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libeigen coinor-libipopt-dev"

RDEPENDS_${PN} = "catkin"

SRC_URI = "https://github.com/ethz-adrl/ifopt-release/archive/release/melodic/ifopt/2.0.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "33725b58093a0b48334aa6505f7a2dd1"
SRC_URI[sha256sum] = "3f35e3e9837f7f609ac6d1f982742d579f760b4d3f366d9711c1420bb136b4e2"

S = "${WORKDIR}/ifopt-release-release-melodic-ifopt-2.0.6-0"

inherit catkin
