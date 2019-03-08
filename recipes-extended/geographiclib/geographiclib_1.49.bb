DESCRIPTION = "GeographicLib is a small set of C++ classes for performing conversions between geographic, UTM, UPS, MGRS, geocentric, and local cartesian coordinates, for gravity (e.g., EGM2008), geoid height, and geomagnetic field (e.g., WMM2010) calculations, and for solving geodesic problems."
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=beda1cf298e14fa7de56a07a83308905" 

DEPENDS = ""

SRC_URI = "${SOURCEFORGE_MIRROR}/${BPN}/distrib/GeographicLib-${PV}.tar.gz"
SRC_URI[md5sum] = "11300e88b4a38692b6a8712d5eafd4d7"
SRC_URI[sha256sum] = "aec0ab52b6b9c9445d9d0a77e3af52257e21d6e74e94d8c2cb8fa6f11815ee2b"

S = "${WORKDIR}/GeographicLib-${PV}"

PACKAGES += "python-${PN} matlab-${PN} node-${PN}"
FILES_python-${PN} = "/usr/lib/python/site-packages"
FILES_matlab-${PN} = "/usr/share/matlab"
FILES_node-${PN} = "/usr/lib/node_modules/"

inherit cmake
