DESCRIPTION = "Library implementing ODVA EtherNet/IP (Industrial Protocol)."
AUTHOR = "Kareem Shehata"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-drivers-gbp/odva_ethernetip-release/archive/release/melodic/odva_ethernetip/0.1.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f6c41a9933167f029362f61e76dd7d19"
SRC_URI[sha256sum] = "41362528d6a0cbefa2cd8120373ecbb2a30182fda78ea9c49341c78874130c24"

S = "${WORKDIR}/odva_ethernetip-release-release-melodic-odva_ethernetip-0.1.3-0"

inherit catkin
