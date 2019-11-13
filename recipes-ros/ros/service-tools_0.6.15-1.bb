DESCRIPTION = "Service tools"
AUTHOR = "Mathias Lüdtke"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "rospy rosservice"

SRC_URI = "https://github.com/ipa320/cob_command_tools-release/archive/release/melodic/service_tools/0.6.15-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d92f422dd0625abaa3d33fa990c30ce9"
SRC_URI[sha256sum] = "60e10e9daee6608854f266791367db4dc6d651946043ccd4cd9753629625498a"

ROS_SPN = "cob_command_tools"
S = "${WORKDIR}/cob_command_tools-release-release-melodic-service_tools-0.6.15-1"

inherit catkin
