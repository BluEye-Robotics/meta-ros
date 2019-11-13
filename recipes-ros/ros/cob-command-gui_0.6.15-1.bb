DESCRIPTION = "This package provides a simple GUI for operating Care-O-bot."
AUTHOR = "Florian Weisshardt"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "cob-msgs cob-script-server python-gtk2 python-pygraphviz roslib rospy"

SRC_URI = "https://github.com/ipa320/cob_command_tools-release/archive/release/melodic/cob_command_gui/0.6.15-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7ecd7335b20237c51b97df07dbb3f096"
SRC_URI[sha256sum] = "21a5bb8f2619868678ef2ba20893b78bcb378393d19b5ebebe034405f510a16d"

ROS_SPN = "cob_command_tools"
S = "${WORKDIR}/cob_command_tools-release-release-melodic-cob_command_gui-0.6.15-1"

inherit catkin
