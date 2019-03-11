DESCRIPTION = "C++ implementation of Lie Groups using Eigen."
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "libeigen"

SRC_URI = "https://github.com/yujinrobot-release/sophus-release/archive/release/melodic/${PN}/${PV}.tar.gz;downloadfilename=${PN}_${PV}.tar.gz"
SRC_URI[md5sum] = "8c4b082f37f9b43d6241317a9cec033e"
SRC_URI[sha256sum] = "9e42bd34716ace8e9d2ac385a63bb85ce3c3eb6df98e1fa76d8b1dc14f6aade2"

S = "${WORKDIR}/${PN}-release-release-melodic-${PN}-${PV}"

inherit catkin

# CXXFLAGS are needed to compile eigen 3.3.1 headers properly
CXXFLAGS += "-Wno-deprecated-declarations -Wno-misleading-indentation -Wno-int-in-bool-context -Wno-ignored-attributes"
