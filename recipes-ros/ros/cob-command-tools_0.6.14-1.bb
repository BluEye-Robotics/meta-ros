DESCRIPTION = "The cob_command_tools stack provides tools, for operating Care-O-bot."
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "cob-command-gui cob-dashboard cob-helper-tools cob-interactive-teleop cob-monitoring cob-script-server cob-teleop"

SRC_URI = "https://github.com/ipa320/cob_command_tools-release/archive/release/melodic/cob_command_tools/0.6.14-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "aaa7d10c9364fa3c136a32aaa74e4072"
SRC_URI[sha256sum] = "f66be4484792dca3d9430646d834338509150b69473af0074e7c8e3f1c9ba3bb"

S = "${WORKDIR}/cob_command_tools-release-release-melodic-cob_command_tools-0.6.14-1"

inherit catkin
