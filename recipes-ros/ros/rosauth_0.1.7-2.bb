DESCRIPTION = "Server Side tools for Authorization and Authentication of ROS Clients"
AUTHOR = "Russell Toris"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "openssl roscpp message-generation rostest message-runtime roscpp"

RDEPENDS_${PN} = "message-runtime roscpp"

SRC_URI = "https://github.com/gt-rail-release/rosauth-release/archive/release/melodic/rosauth/0.1.7-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "450a3ecb512b1784fb08c575b69d2609"
SRC_URI[sha256sum] = "9d3f956efc11d59d7fb973249d34a497dfe1649d77dffe76da6cc29a485a6c31"

S = "${WORKDIR}/rosauth-release-release-melodic-rosauth-0.1.7-2"

inherit catkin
