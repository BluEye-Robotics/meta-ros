DESCRIPTION = "C++ implementation of Lie Groups using Eigen."
AUTHOR = "Hauke Strasdat"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "libeigen libeigen"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/yujinrobot-release/sophus-release/archive/release/melodic/sophus/1.0.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8c4b082f37f9b43d6241317a9cec033e"
SRC_URI[sha256sum] = "9e42bd34716ace8e9d2ac385a63bb85ce3c3eb6df98e1fa76d8b1dc14f6aade2"

S = "${WORKDIR}/sophus-release-release-melodic-sophus-1.0.1-1"

inherit catkin
