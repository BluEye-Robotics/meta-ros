DESCRIPTION = "The URDF (U-Robot Description Format) headers provides core \
data structure headers for URDF."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b441202ba2d6b14d62026cb18bb960ed"

SRC_URI = "https://github.com/ros/urdfdom_headers/archive/${PV}.tar.gz;downloadfilename=${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "92a62484d9ea033ae6fd9a03d57138c0"
SRC_URI[sha256sum] = "01fec111f91805eb5bcbbee56b5da7413de7a7485ad4c63ea51614ebdfc25eca"

S = "${WORKDIR}/urdfdom_headers-${PV}"

FILES_${PN}-dev += "/usr/share/urdfdom_headers/cmake"

inherit cmake faulty-solibs

ALLOW_EMPTY_${PN} = "1"
