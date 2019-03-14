DESCRIPTION = "A Levenberg-Marquardt solver for EXOTica"
AUTHOR = ""
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "exotica-core libeigen"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipab-slmc/exotica-release/archive/release/melodic/exotica_levenberg_marquardt_solver/5.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bb872960faf09ce1580374fa34092e27"
SRC_URI[sha256sum] = "8de5b8fb856c5ca84c37447698c4635251f39b39db82d323f6b788aea4b1d93f"

ROS_SPN = "exotica"
S = "${WORKDIR}/exotica-release-release-melodic-exotica_levenberg_marquardt_solver-5.0.0-0"

inherit catkin
