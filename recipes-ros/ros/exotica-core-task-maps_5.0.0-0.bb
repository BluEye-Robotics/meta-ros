DESCRIPTION = "Common taskmaps provided with EXOTica."
AUTHOR = "Michael Camilleri"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "exotica-core exotica-python geometry-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipab-slmc/exotica-release/archive/release/melodic/exotica_core_task_maps/5.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "015ff0c3ad4614ae030cfcfd37715a88"
SRC_URI[sha256sum] = "3a3613b62c0ad3be115ad5c6214e3ed1d8b55280d5bd7b20555ad4585d3b0b49"

ROS_SPN = "exotica"
S = "${WORKDIR}/exotica-release-release-melodic-exotica_core_task_maps-5.0.0-0"

inherit catkin
