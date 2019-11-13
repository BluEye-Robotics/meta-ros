DESCRIPTION = "This stack contains drivers for the ethercat system and the peripherals that connect to it: motor control boards, fingertip sensors, texture projector, hand accelerometer."
AUTHOR = "Derek King"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ethercat-hardware fingertip-pressure"

RDEPENDS_${PN} = "ethercat-hardware fingertip-pressure"

SRC_URI = "https://github.com/pr2-gbp/pr2_ethercat_drivers-release/archive/release/melodic/pr2_ethercat_drivers/1.8.19-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cbf36fd116e731784278b301def202d3"
SRC_URI[sha256sum] = "e28b1bb1eb08c709820f7a571ca092a5ccf5035f877019f105ef2f3f485ff049"

S = "${WORKDIR}/pr2_ethercat_drivers-release-release-melodic-pr2_ethercat_drivers-1.8.19-1"

inherit catkin
