DESCRIPTION = "Package with external libraries used in Industrial and Service workspaces. Currentlly supported Libraries: Reflexxes, Libmodbus."
AUTHOR = "Denis Štogl"
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = ""

RDEPENDS_${PN} = "libreflexxestype2 ros-reflexxes libmodbus"

SRC_URI = "https://github.com/KITrobotics/ipr_extern-release/archive/release/melodic/ipr_extern/0.8.8-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bf510efe8f2ce724844e8518fd9bf096"
SRC_URI[sha256sum] = "a117475704fac421bb5f283eb775ab4339944f6ea148c2c996c0fb7642bb0fe8"

S = "${WORKDIR}/ipr_extern-release-release-melodic-ipr_extern-0.8.8-1"

inherit catkin
