DESCRIPTION = "The iirob_filters package implements following filters: 1) Low-Pass 2) Moving Mean 3) Gravity Compensation (used for force-torque sensors) 4) Threshold Filter"
AUTHOR = ""
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "cmake-modules"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/KITrobotics/ipr_extern-release/archive/release/melodic/libmodbus/0.8.8-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "39d948fdec5fc9e1cc86d2784eac1500"
SRC_URI[sha256sum] = "f5b0b1453abb1f1950ad1ca3378b061979259515d0d5bdc5958dd46a5c6b3c36"

ROS_SPN = "ipr_extern"
S = "${WORKDIR}/ipr_extern-release-release-melodic-libmodbus-0.8.8-1"

inherit catkin
