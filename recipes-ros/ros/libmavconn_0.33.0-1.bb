DESCRIPTION = "MAVLink communication library. This library provide unified connection handling classes and URL to connection object mapper. This library can be used in standalone programs."
AUTHOR = "Vladimir Ermakov"
SECTION = "devel"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "boost mavlink console-bridge"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/melodic/libmavconn/0.33.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e1f2f539b9869efd3cc0e615536fd69d"
SRC_URI[sha256sum] = "a799c13f4fdc90ee18cefa60c4e6da825201b958ff66311a2e0c525792ba8135"

ROS_SPN = "mavros"
S = "${WORKDIR}/mavros-release-release-melodic-libmavconn-0.33.0-1"

inherit catkin
