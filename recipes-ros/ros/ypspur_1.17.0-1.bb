DESCRIPTION = "YP-Spur is a mobile robot motion control software with coordinate frame based commands."
AUTHOR = ""
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "libreadline-dev"

RDEPENDS_${PN} = "catkin libreadline"

SRC_URI = "https://github.com/openspur/yp-spur-release/archive/release/melodic/ypspur/1.17.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e9f3b9f0edb6781eacfa263139fccc40"
SRC_URI[sha256sum] = "205b4d6d1fa49430f94c81c2d4f80c5c0bd1de0be2a2ec112656232f3af9ea8c"

ROS_SPN = "yp-spur"
S = "${WORKDIR}/yp-spur-release-release-melodic-ypspur-1.17.0-1"

inherit catkin
