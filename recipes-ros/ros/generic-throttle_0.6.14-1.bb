DESCRIPTION = "This package provides a throttle for ROS topics"
AUTHOR = "Mattia Racca"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "rospy cv-bridge rostopic"

SRC_URI = "https://github.com/ipa320/cob_command_tools-release/archive/release/melodic/generic_throttle/0.6.14-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7023dceefd06c798c6a39fcc352bf205"
SRC_URI[sha256sum] = "f31dd28bb3f853623614e04c3dd970b2e6e2576f61958bb27b61d0c33aea2fe6"

ROS_SPN = "cob_command_tools"
S = "${WORKDIR}/cob_command_tools-release-release-melodic-generic_throttle-0.6.14-1"

inherit catkin
