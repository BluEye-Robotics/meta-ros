DESCRIPTION = "Teleop node"
AUTHOR = "Florian Weisshardt, Maximilian Sieber"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "actionlib cob-light cob-script-server cob-sound geometry-msgs roscpp sensor-msgs std-msgs std-srvs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_command_tools-release/archive/release/melodic/cob_teleop/0.6.14-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4182b8617693a214e55492d2cc3aa33e"
SRC_URI[sha256sum] = "0ac4ee1f1fc4e50b30c1480a54741ffdff32d0577a8c63808dd4f553518f7b7a"

ROS_SPN = "cob_command_tools"
S = "${WORKDIR}/cob_command_tools-release-release-melodic-cob_teleop-0.6.14-1"

inherit catkin
