DESCRIPTION = "Teleop node"
AUTHOR = "Florian Weisshardt, Maximilian Sieber"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "actionlib cob-actions cob-light cob-script-server cob-sound geometry-msgs roscpp sensor-msgs std-msgs std-srvs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_command_tools-release/archive/release/melodic/cob_teleop/0.6.15-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "256c5cebc0f039aa1e3d6221bb2e6ea8"
SRC_URI[sha256sum] = "47c3e837841c74f8c931e2ec96410a6fb3a0e4233a1028570b0401a27d59d598"

ROS_SPN = "cob_command_tools"
S = "${WORKDIR}/cob_command_tools-release-release-melodic-cob_teleop-0.6.15-1"

inherit catkin
