DESCRIPTION = "A ROS node that watches a given network interface and publishes whether it is both UP and RUNNING (indicating that a cable is plugged into it and communication is happening, for instance) or not."
AUTHOR = "Dave Hershberger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp std-msgs roscpp std-msgs"

RDEPENDS_${PN} = "roscpp std-msgs"

SRC_URI = "https://github.com/pr2-gbp/linux_networking-release/archive/release/melodic/network_detector/1.0.13-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e7caa124c4647f7e43d31b7930a4a866"
SRC_URI[sha256sum] = "9a614eb87c2da1654949748ff121761e81aa54c428fe07970ddaa907073c565c"

ROS_SPN = "linux_networking"
S = "${WORKDIR}/linux_networking-release-release-melodic-network_detector-1.0.13-2"

inherit catkin
