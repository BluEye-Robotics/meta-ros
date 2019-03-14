DESCRIPTION = "Serial is a cross-platform, simple to use library for using serial ports on computers. This library provides a C++, object oriented interface for interacting with RS-232 like devices on Linux and Windows."
AUTHOR = "William Woodall"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/wjwwood/serial-release/archive/release/melodic/serial/1.2.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1524caaf3c84b80e7855e5f5fa32ea47"
SRC_URI[sha256sum] = "2509a47393feef491a0876997beb0fd9af9ecc4e6ed6ceb533f3b8840471f1c2"

S = "${WORKDIR}/serial-release-release-melodic-serial-1.2.1-0"

inherit catkin
