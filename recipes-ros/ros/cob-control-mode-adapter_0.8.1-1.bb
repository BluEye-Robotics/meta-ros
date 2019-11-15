DESCRIPTION = "The cob_control_mode_adapter package"
AUTHOR = "Felix Messmer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "boost controller-manager-msgs roscpp roslint std-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/melodic/cob_control_mode_adapter/0.8.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8f62b1cff6e42597c008b712a4c77f37"
SRC_URI[sha256sum] = "e9f645239ae0f8c11405e5417b45d85db5aa2da90a8903d4c6b9a876b59fa713"

ROS_SPN = "cob_control"
S = "${WORKDIR}/cob_control-release-release-melodic-cob_control_mode_adapter-0.8.1-1"

inherit catkin
