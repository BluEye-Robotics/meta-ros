DESCRIPTION = "Library implementing ODVA EtherNet/IP (Industrial Protocol)."
AUTHOR = "Kareem Shehata"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost console-bridge"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-drivers-gbp/odva_ethernetip-release/archive/release/melodic/odva_ethernetip/0.1.4-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "457c8f7b685dbe55e6f427580bf1b275"
SRC_URI[sha256sum] = "5ab751b07939ccd1fb02691e6d370dcf721b38371208efe92e9ec7d507481c7a"

S = "${WORKDIR}/odva_ethernetip-release-release-melodic-odva_ethernetip-0.1.4-0"

inherit catkin
