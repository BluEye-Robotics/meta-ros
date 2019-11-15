DESCRIPTION = "The cob_command_tools stack provides tools, for operating Care-O-bot."
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "cob-command-gui cob-dashboard cob-helper-tools cob-interactive-teleop cob-monitoring cob-script-server cob-teleop"

SRC_URI = "https://github.com/ipa320/cob_command_tools-release/archive/release/melodic/cob_command_tools/0.6.15-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "08ce22cf6b7579fb7bafdc8f31b6ed35"
SRC_URI[sha256sum] = "84a137502724a990c827376866b80330d8273dd1780931940f0e03bd9a1aebd8"

S = "${WORKDIR}/cob_command_tools-release-release-melodic-cob_command_tools-0.6.15-1"

inherit catkin
