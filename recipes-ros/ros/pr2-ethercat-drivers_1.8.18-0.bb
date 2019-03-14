DESCRIPTION = "This stack contains drivers for the ethercat system and the peripherals that connect to it: motor control boards, fingertip sensors, texture projector, hand accelerometer."
AUTHOR = "Derek King"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ethercat-hardware fingertip-pressure"

RDEPENDS_${PN} = "ethercat-hardware fingertip-pressure"

SRC_URI = "https://github.com/pr2-gbp/pr2_ethercat_drivers-release/archive/release/melodic/pr2_ethercat_drivers/1.8.18-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "31bcda9d6ff24fcc1e287d8ec5dba0e8"
SRC_URI[sha256sum] = "788a0ce8f237a573f1ae50c180ea6647bf161f91f28faaf11063efcf1f81d829"

S = "${WORKDIR}/pr2_ethercat_drivers-release-release-melodic-pr2_ethercat_drivers-1.8.18-0"

inherit catkin
