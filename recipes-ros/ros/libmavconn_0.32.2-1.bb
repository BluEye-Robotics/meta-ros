DESCRIPTION = "MAVLink communication library. This library provide unified connection handling classes and URL to connection object mapper. This library can be used in standalone programs."
AUTHOR = "Vladimir Ermakov"
SECTION = "devel"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "boost mavlink console-bridge"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/melodic/libmavconn/0.32.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1abaaea0cd3f6037c08c2d797d5bb67c"
SRC_URI[sha256sum] = "45e166c96c99158eaf7655789974db030e96d6b57c9089eb1e759cf77ba7cc75"

ROS_SPN = "mavros"
S = "${WORKDIR}/mavros-release-release-melodic-libmavconn-0.32.2-1"

inherit catkin
