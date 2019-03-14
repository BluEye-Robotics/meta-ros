DESCRIPTION = "URDF file descriptions for P2OS/ARCOS robot"
AUTHOR = "Hunter L. Allen"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "urdf std-msgs sensor-msgs geometry-msgs tf kdl-parser"

RDEPENDS_${PN} = "p2os-msgs p2os-driver"

SRC_URI = "https://github.com/allenh1/p2os-release/archive/release/melodic/p2os_urdf/2.1.1-3.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "63a392710a3b8f787e088a940f96d4e3"
SRC_URI[sha256sum] = "10b0c2e34e4c56a3816165507eb40d1424b6d77c82f9fa09729e5f5069745c11"

ROS_SPN = "p2os"
S = "${WORKDIR}/p2os-release-release-melodic-p2os_urdf-2.1.1-3"

inherit catkin
