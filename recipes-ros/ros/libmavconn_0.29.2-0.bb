DESCRIPTION = "MAVLink communication library. This library provide unified connection handling classes and URL to connection object mapper. This library can be used in standalone programs."
AUTHOR = "Vladimir Ermakov"
SECTION = "devel"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "boost mavlink console-bridge"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/melodic/libmavconn/0.29.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "78df0c101150b0d567e58e4e92a29280"
SRC_URI[sha256sum] = "01a2d5c29791a6b4a85dc55a16b5a904fa22c58e73c99df0172cf8e8870c02b2"

ROS_SPN = "mavros"
S = "${WORKDIR}/mavros-release-release-melodic-libmavconn-0.29.2-0"

inherit catkin
