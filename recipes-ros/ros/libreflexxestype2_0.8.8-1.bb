DESCRIPTION = "Package with ReflexxesTypeII implementation and header files"
AUTHOR = ""
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/KITrobotics/ipr_extern-release/archive/release/melodic/libreflexxestype2/0.8.8-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f038cc03b1af5b180c3b04054ab8059c"
SRC_URI[sha256sum] = "ff69ec96c35d48bc4b768dc25812ea2dbece052f25a8d3de96f5460296eb0ccf"

ROS_SPN = "ipr_extern"
S = "${WORKDIR}/ipr_extern-release-release-melodic-libreflexxestype2-0.8.8-1"

inherit catkin
