DESCRIPTION = "Contains the Documentation for the p2os driver/componenets"
AUTHOR = "Hunter L. Allen"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/allenh1/p2os-release/archive/release/melodic/p2os_doc/2.1.1-3.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "804593cdc6e9e07d2dd60b0bbd5468de"
SRC_URI[sha256sum] = "227edf1f84b669f969f96db7c374ba1985c0ae65383edeccbae293321d80ab86"

ROS_SPN = "p2os"
S = "${WORKDIR}/p2os-release-release-melodic-p2os_doc-2.1.1-3"

inherit catkin
