DESCRIPTION = "YP-Spur is a mobile robot motion control software with coordinate frame based commands."
AUTHOR = ""
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "libreadline-dev"

RDEPENDS_${PN} = "catkin libreadline"

SRC_URI = "https://github.com/openspur/yp-spur-release/archive/release/melodic/ypspur/1.16.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fa6ca32de9b36a36f2b4b816b84754b1"
SRC_URI[sha256sum] = "25896b5bc94699faa2318d80f78b857fa7bdd36444f7941a34947ad970a3f211"

ROS_SPN = "yp-spur"
S = "${WORKDIR}/yp-spur-release-release-melodic-ypspur-1.16.0-1"

inherit catkin
