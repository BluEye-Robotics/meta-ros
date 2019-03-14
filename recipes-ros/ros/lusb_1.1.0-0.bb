DESCRIPTION = "Library for interfacing to USB devices"
AUTHOR = "Kevin Hallenbeck"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libusb-1.0-dev boost"

RDEPENDS_${PN} = "libusb-1.0"

SRC_URI = "https://github.com/DataspeedInc-release/lusb-release/archive/release/melodic/lusb/1.1.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "103c18dab4c2e1fc550f4fa72cb8a322"
SRC_URI[sha256sum] = "a2b403bcddedcfb51d9c51f29f2364cd8a82997ba8bdb801a40e84bea748daf6"

S = "${WORKDIR}/lusb-release-release-melodic-lusb-1.1.0-0"

inherit catkin
