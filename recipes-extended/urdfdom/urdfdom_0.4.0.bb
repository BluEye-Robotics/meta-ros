DESCRIPTION = "The URDF (U-Robot Description Format) library provides core \
data structures and a simple XML parsers for populating the class data \
structures from an URDF file."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b441202ba2d6b14d62026cb18bb960ed"

SRC_URI = "https://github.com/ros/${PN}/archive/${PV}.tar.gz;downloadfilename=${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b97aec18a49969285f63d5876cf633c9"
SRC_URI[sha256sum] = "d3d330edc00706ffcf7472cda3653995e3f8c953ffb930617c241f5ae856775f"

DEPENDS = "urdfdom-headers console-bridge libtinyxml"

S = "${WORKDIR}/${PN}-${PV}"

inherit cmake fix-system-include
