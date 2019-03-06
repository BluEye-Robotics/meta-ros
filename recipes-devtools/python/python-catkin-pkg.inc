DESCRIPTION = "catkin package library"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"
PYPI_PACKAGE = "catkin_pkg"

SRC_URI[md5sum] = "0c8752ab98ab06481a2ea7d037ac3878"
SRC_URI[sha256sum] = "22255fe79f3e3e64472e2abc3714fb46bd260b2cdfa4ffdc6e2b1b7bd59b64db"

inherit pypi

DEPENDS += "${PYTHON_PN}-pyparsing"
RDEPENDS_${PN} += "${PYTHON_PN}-pyparsing"

BBCLASSEXTEND += "native"
