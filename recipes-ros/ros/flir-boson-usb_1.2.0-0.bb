DESCRIPTION = "A simple USB camera driver for the FLIR BOSON using OpenCV"
AUTHOR = "Joe Driscoll"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "roslint roscpp nodelet cv-bridge camera-info-manager image-transport sensor-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/astuff/flir_boson_usb-release/archive/release/melodic/flir_boson_usb/1.2.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ca0c7cb80e431d7bf1a1aa62853631bb"
SRC_URI[sha256sum] = "79c3e1f53669699fa6af61305dd25dfabddbf213bfa36df3b3419950dcf3568f"

S = "${WORKDIR}/flir_boson_usb-release-release-melodic-flir_boson_usb-1.2.0-0"

inherit catkin
