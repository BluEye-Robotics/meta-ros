DESCRIPTION = "This Package contains Care-O-bot specific action definitions."
AUTHOR = "Felix Messmer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation actionlib-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ipa320/cob_common-release/archive/release/melodic/cob_actions/0.7.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6e13f96b9a85172184c7aa5adf7b1214"
SRC_URI[sha256sum] = "4d88715a20c1d162791421cf834761a2a5bcd1370e0a67087c6802f9932ee010"

ROS_SPN = "cob_common"
S = "${WORKDIR}/cob_common-release-release-melodic-cob_actions-0.7.1-1"

inherit catkin
