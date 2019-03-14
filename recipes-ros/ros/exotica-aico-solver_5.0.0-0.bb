DESCRIPTION = "Implementation of the Approximate Inference Control algorithm (AICO)"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "exotica-core"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipab-slmc/exotica-release/archive/release/melodic/exotica_aico_solver/5.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "acf93283cbfabd41294862b9825bbc4f"
SRC_URI[sha256sum] = "9c25ea0be3ab138229ba6c7dd74b518c2b317a642168a6f277e46092b9eeae35"

ROS_SPN = "exotica"
S = "${WORKDIR}/exotica-release-release-melodic-exotica_aico_solver-5.0.0-0"

inherit catkin
