DESCRIPTION = "This package wraps the libphidgets to use it as a ros dependency"
AUTHOR = "Alexander Bubeck"
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "libusb-dev"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_extern-release/archive/release/melodic/libphidgets/0.6.13-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "803b61a024360fb4ec0bda994afac255"
SRC_URI[sha256sum] = "f7a17252175d38583ab243496409ca648c02c0b7f2782b7f7db40957096397d1"

ROS_SPN = "cob_extern"
S = "${WORKDIR}/cob_extern-release-release-melodic-libphidgets-0.6.13-1"

inherit catkin
