DESCRIPTION = "A simple USB camera driver for the FLIR BOSON using OpenCV"
AUTHOR = "Joe Driscoll"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "roslint roscpp nodelet cv-bridge camera-info-manager image-transport sensor-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/astuff/flir_boson_usb-release/archive/release/melodic/flir_boson_usb/1.2.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "63f56862d1f77ac7165cfbdff08e6432"
SRC_URI[sha256sum] = "8c1bec8b2961607d526d51d6ab068534865aee4f71a1a66c326f6bd552bbdedb"

S = "${WORKDIR}/flir_boson_usb-release-release-melodic-flir_boson_usb-1.2.1-1"

inherit catkin
