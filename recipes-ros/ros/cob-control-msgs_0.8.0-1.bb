DESCRIPTION = "Common messages and services used in various packages within cob_control."
AUTHOR = "Felix Messmer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation geometry-msgs std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/melodic/cob_control_msgs/0.8.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2688bfd2b499bed0d10bec935fcbe7a0"
SRC_URI[sha256sum] = "faa2290e9264a914ba18b9d6eac02f383d12cd72c8fb918c2bf7c92d4f694a1d"

ROS_SPN = "cob_control"
S = "${WORKDIR}/cob_control-release-release-melodic-cob_control_msgs-0.8.0-1"

inherit catkin
