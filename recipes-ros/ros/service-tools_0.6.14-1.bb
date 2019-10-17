DESCRIPTION = "Service tools"
AUTHOR = "Mathias Lüdtke"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "rospy rosservice"

SRC_URI = "https://github.com/ipa320/cob_command_tools-release/archive/release/melodic/service_tools/0.6.14-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e2b33283de72bbcf692f9e7387ebfc97"
SRC_URI[sha256sum] = "d8de2097736deeef77aac6f13f80218cc42979293c72d00e0cce6dff9a954cd0"

ROS_SPN = "cob_command_tools"
S = "${WORKDIR}/cob_command_tools-release-release-melodic-service_tools-0.6.14-1"

inherit catkin
