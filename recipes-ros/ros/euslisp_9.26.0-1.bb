DESCRIPTION = "EusLisp is an integrated programming system for the research on intelligent robots based on Common Lisp and Object-Oriented programming"
AUTHOR = "Toshihiro Matsui"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " libjpeg libx11-dev libxext libpng-dev libpq-dev cmake-modules mk xfonts-100dpi xfonts-75dpi  libjpeg libx11-dev libxext libpng-dev libpq-dev xfonts-100dpi xfonts-75dpi"

RDEPENDS_${PN} = " libjpeg libx11-dev libxext libpng-dev libpq-dev xfonts-100dpi xfonts-75dpi"

SRC_URI = "https://github.com/tork-a/euslisp-release/archive/release/melodic/euslisp/9.26.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a395258cb3d8804861768870a2ec5ede"
SRC_URI[sha256sum] = "267e9150e430c87ed26dd58e103e1db0ef56dfe6580f16bf3352ebb23f5f374a"

S = "${WORKDIR}/euslisp-release-release-melodic-euslisp-9.26.0-1"

inherit catkin
