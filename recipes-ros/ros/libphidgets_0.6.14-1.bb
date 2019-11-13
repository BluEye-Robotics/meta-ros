DESCRIPTION = "This package wraps the libphidgets to use it as a ros dependency"
AUTHOR = "Alexander Bubeck"
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "libusb-dev"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_extern-release/archive/release/melodic/libphidgets/0.6.14-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6ac6fad6371509ffd7355805d223b381"
SRC_URI[sha256sum] = "a34ac46d7679c615ab632f4c7d59472db4794c323677ca94ac4d335527a82d62"

ROS_SPN = "cob_extern"
S = "${WORKDIR}/cob_extern-release-release-melodic-libphidgets-0.6.14-1"

inherit catkin
