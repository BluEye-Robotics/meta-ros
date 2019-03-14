DESCRIPTION = "Driver file descriptions for P2OS/ARCOS robot"
AUTHOR = "Hunter L. Allen"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "std-msgs p2os-msgs geometry-msgs tf roscpp nav-msgs diagnostic-updater kdl-parser"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/allenh1/p2os-release/archive/release/melodic/p2os_driver/2.1.1-3.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a4112b627091cfd0963bb891addc6e0f"
SRC_URI[sha256sum] = "6964b9f9c333b2290f586f8ea5bb23cd9bf6d3eb0e774dd33d2498624bae978d"

ROS_SPN = "p2os"
S = "${WORKDIR}/p2os-release-release-melodic-p2os_driver-2.1.1-3"

inherit catkin
