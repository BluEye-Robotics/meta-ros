DESCRIPTION = "Helper scripts for Care-O-bot"
AUTHOR = "Felix Messmer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation dynamic-reconfigure"

RDEPENDS_${PN} = "message-runtime cob-msgs cob-script-server diagnostic-msgs rospy tf visualization-msgs"

SRC_URI = "https://github.com/ipa320/cob_command_tools-release/archive/release/melodic/cob_helper_tools/0.6.14-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4261745f834f2659f72ba70f471b5984"
SRC_URI[sha256sum] = "c75043752d83abf34bc0d49dc3376d3c64d74c71e7b7c50195c23bca5a3cbfc9"

ROS_SPN = "cob_command_tools"
S = "${WORKDIR}/cob_command_tools-release-release-melodic-cob_helper_tools-0.6.14-1"

inherit catkin
