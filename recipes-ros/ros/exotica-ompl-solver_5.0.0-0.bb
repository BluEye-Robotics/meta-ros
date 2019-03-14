DESCRIPTION = "Exotica solvers based on the Open Motion Planning Libary (OMPL)"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "exotica-core ompl exotica-python"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipab-slmc/exotica-release/archive/release/melodic/exotica_ompl_solver/5.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "37dce488668d63fbfef1bae307b015e7"
SRC_URI[sha256sum] = "07851ceb7d6c1cae605a7ba07157219995fcb3e1358f65c62daf96e73012ff26"

ROS_SPN = "exotica"
S = "${WORKDIR}/exotica-release-release-melodic-exotica_ompl_solver-5.0.0-0"

inherit catkin
