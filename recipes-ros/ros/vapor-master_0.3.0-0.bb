DESCRIPTION = "high availability ros master"
AUTHOR = "RosHub Inc."
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = ""

RDEPENDS_${PN} = "rospack nodejs"

SRC_URI = "https://github.com/roshub/vapor_master-release/archive/release/melodic/vapor_master/0.3.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cdac5ed9a2b2d382adb4643c1309478b"
SRC_URI[sha256sum] = "c6fc8a631a9237b71a58f298e1394f498f3374ba2698c365f0aae44e5a75ca32"

S = "${WORKDIR}/vapor_master-release-release-melodic-vapor_master-0.3.0-0"

inherit catkin
