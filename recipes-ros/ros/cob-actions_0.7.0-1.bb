DESCRIPTION = "This Package contains Care-O-bot specific action definitions."
AUTHOR = "Felix Messmer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation actionlib-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ipa320/cob_common-release/archive/release/melodic/cob_actions/0.7.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a5fc2f0ab6473cc06e8931caad9be592"
SRC_URI[sha256sum] = "e0b2160a5f7bc82fb3563950a37d700bc2edcfec3da60c0a9b1d77bec8799764"

ROS_SPN = "cob_common"
S = "${WORKDIR}/cob_common-release-release-melodic-cob_actions-0.7.0-1"

inherit catkin
