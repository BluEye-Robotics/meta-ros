DESCRIPTION = "COB teleop interactive marker for RViz provided by dcgm-robotics@FIT group."
AUTHOR = "Michal Spanel"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "geometry-msgs interactive-markers roscpp std-msgs tf visualization-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_command_tools-release/archive/release/melodic/cob_interactive_teleop/0.6.15-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0c565f9310db5fa718ee33313f5d6344"
SRC_URI[sha256sum] = "951e70090c4936c9c40a0f57e7728040512e045de237b7c750d3c8b3f7ef9fac"

ROS_SPN = "cob_command_tools"
S = "${WORKDIR}/cob_command_tools-release-release-melodic-cob_interactive_teleop-0.6.15-1"

inherit catkin
