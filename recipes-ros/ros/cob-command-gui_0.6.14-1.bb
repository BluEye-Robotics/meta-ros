DESCRIPTION = "This package provides a simple GUI for operating Care-O-bot."
AUTHOR = "Florian Weisshardt"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "cob-msgs cob-script-server python3-gtk2 python3-pygraphviz roslib rospy"

SRC_URI = "https://github.com/ipa320/cob_command_tools-release/archive/release/melodic/cob_command_gui/0.6.14-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4f8721bd59aede2a623431c932158fc4"
SRC_URI[sha256sum] = "3d4b8e12ebc3b6c7f5214e427cd9b7fe3d22a8639fc05a7f8830b7d703d69d3d"

ROS_SPN = "cob_command_tools"
S = "${WORKDIR}/cob_command_tools-release-release-melodic-cob_command_gui-0.6.14-1"

inherit catkin
