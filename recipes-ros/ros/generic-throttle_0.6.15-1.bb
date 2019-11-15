DESCRIPTION = "This package provides a throttle for ROS topics"
AUTHOR = "Mattia Racca"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "rospy cv-bridge rostopic"

SRC_URI = "https://github.com/ipa320/cob_command_tools-release/archive/release/melodic/generic_throttle/0.6.15-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b688bf83352ccbe1a2733d4b0c52b8b2"
SRC_URI[sha256sum] = "8f7eb12d899b0852220f99dc0d0271979c3f357b9619d3bf9f80d80e36cad91d"

ROS_SPN = "cob_command_tools"
S = "${WORKDIR}/cob_command_tools-release-release-melodic-generic_throttle-0.6.15-1"

inherit catkin
