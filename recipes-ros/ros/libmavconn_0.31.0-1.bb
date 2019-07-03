DESCRIPTION = "MAVLink communication library. This library provide unified connection handling classes and URL to connection object mapper. This library can be used in standalone programs."
AUTHOR = "Vladimir Ermakov"
SECTION = "devel"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "boost mavlink console-bridge"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/melodic/libmavconn/0.31.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ce988ed8617ce491568f65408ee1755d"
SRC_URI[sha256sum] = "8fd1147839550cc69a8268ba1f9486435876bd455d95b8734fc68735a0c3066a"

ROS_SPN = "mavros"
S = "${WORKDIR}/mavros-release-release-melodic-libmavconn-0.31.0-1"

inherit catkin
