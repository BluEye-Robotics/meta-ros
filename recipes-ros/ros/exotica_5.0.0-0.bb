DESCRIPTION = "The Extensible Optimization Toolset (EXOTica) is a library for defining problems for robot motion planning. This package serves similar to a metapackage and contains dependencies onto all core-released exotica packages. It also builds the documentation."
AUTHOR = "Vladimir Ivan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "exotica-aico-solver exotica-collision-scene-fcl exotica-collision-scene-fcl-latest exotica-core exotica-core-task-maps exotica-ik-solver exotica-levenberg-marquardt-solver exotica-ompl-solver exotica-python exotica-time-indexed-rrt-connect-solver"

SRC_URI = "https://github.com/ipab-slmc/exotica-release/archive/release/melodic/exotica/5.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2f5ef40f9b4f91f4333aee8d7ec8e418"
SRC_URI[sha256sum] = "c765e57dd0796114cc5b4bdaaeb8f8f55dd9311bbcc7320273be1fc4d6dc0d52"

S = "${WORKDIR}/exotica-release-release-melodic-exotica-5.0.0-0"

inherit catkin
