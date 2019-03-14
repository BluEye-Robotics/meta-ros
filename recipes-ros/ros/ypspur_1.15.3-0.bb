DESCRIPTION = "YP-Spur is a mobile robot motion control software with coordinate frame based commands."
AUTHOR = ""
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "libreadline-dev"

RDEPENDS_${PN} = "catkin libreadline"

SRC_URI = "https://github.com/openspur/yp-spur-release/archive/release/melodic/ypspur/1.15.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "12c5dfa46d7b3601bc24d474a37d4077"
SRC_URI[sha256sum] = "35d3539033d2e62e0a731c12c4cce634e0976e41be664aac51ac0da12fae19a2"

ROS_SPN = "yp-spur"
S = "${WORKDIR}/yp-spur-release-release-melodic-ypspur-1.15.3-0"

inherit catkin
