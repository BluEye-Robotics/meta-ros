DESCRIPTION = "Time-Indexed RRT-Connect solver (Humanoids 2018)"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "exotica-core ompl"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipab-slmc/exotica-release/archive/release/melodic/exotica_time_indexed_rrt_connect_solver/5.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "86e519b7facb42b34c69dd07b513c1c6"
SRC_URI[sha256sum] = "e5b831d55d98996965fed4fcdd67e9c99bc140caa7b0273227c9805a193565ec"

ROS_SPN = "exotica"
S = "${WORKDIR}/exotica-release-release-melodic-exotica_time_indexed_rrt_connect_solver-5.0.0-0"

inherit catkin
