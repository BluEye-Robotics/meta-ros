DESCRIPTION = "Pseudo-inverse unconstrained end-pose solver"
AUTHOR = "Michael Camilleri"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "exotica-core"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipab-slmc/exotica-release/archive/release/melodic/exotica_ik_solver/5.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e179450bfdc271e7f2bd0529fb1cbe92"
SRC_URI[sha256sum] = "6f5acb6bf7625497c93ce8204bd5bb8eb05441eb32973da328e34bd0cbfa27f5"

ROS_SPN = "exotica"
S = "${WORKDIR}/exotica-release-release-melodic-exotica_ik_solver-5.0.0-0"

inherit catkin
