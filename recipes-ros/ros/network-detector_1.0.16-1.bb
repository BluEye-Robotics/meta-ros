DESCRIPTION = "A ROS node that watches a given network interface and publishes whether it is both UP and RUNNING (indicating that a cable is plugged into it and communication is happening, for instance) or not."
AUTHOR = "Dave Hershberger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp std-msgs roscpp std-msgs"

RDEPENDS_${PN} = "roscpp std-msgs"

SRC_URI = "https://github.com/pr2-gbp/linux_networking-release/archive/release/melodic/network_detector/1.0.16-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "dbef87226bc741843748558c859d7bf9"
SRC_URI[sha256sum] = "3fe42df98f3203e253a6029d3fb55e86e8d0b82c482754232de296bfe1f299c2"

ROS_SPN = "linux_networking"
S = "${WORKDIR}/linux_networking-release-release-melodic-network_detector-1.0.16-1"

inherit catkin
