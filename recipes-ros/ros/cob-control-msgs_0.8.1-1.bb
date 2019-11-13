DESCRIPTION = "Common messages and services used in various packages within cob_control."
AUTHOR = "Felix Messmer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation geometry-msgs std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/melodic/cob_control_msgs/0.8.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a36fb8717f4f7e8ab24b02a8cf76fe30"
SRC_URI[sha256sum] = "9b46e954b2e2e6b8ff110fe67a879280598d2b8153228d3e61febd1ffbfab493"

ROS_SPN = "cob_control"
S = "${WORKDIR}/cob_control-release-release-melodic-cob_control_msgs-0.8.1-1"

inherit catkin
