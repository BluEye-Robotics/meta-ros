DESCRIPTION = "Catkin macros to allow using pure python packages in usual catkin workspaces with normal python workflow."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python python3-pip"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/pyros-dev/catkin_pip-release/archive/release/melodic/catkin_pip/0.2.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "398c267be70f7dc2f370153276b63979"
SRC_URI[sha256sum] = "195b4747147d7d36eea1f1c5398e532289984d6d690dd58e04acf556462deda4"

S = "${WORKDIR}/catkin_pip-release-release-melodic-catkin_pip-0.2.3-1"

inherit catkin
