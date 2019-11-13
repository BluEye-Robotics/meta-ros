DESCRIPTION = "This package wraps the libpcan to use it as a ros dependency"
AUTHOR = "Florian Weisshardt"
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_extern-release/archive/release/melodic/libpcan/0.6.14-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "faa5b331d8476f9efa13c89f2415e0a0"
SRC_URI[sha256sum] = "261e7b4b413a23796bb4eec4744829006cfa89c83ec9ef0804091576a87f136c"

ROS_SPN = "cob_extern"
S = "${WORKDIR}/cob_extern-release-release-melodic-libpcan-0.6.14-1"

inherit catkin
