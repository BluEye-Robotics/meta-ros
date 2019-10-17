DESCRIPTION = "COB teleop interactive marker for RViz provided by dcgm-robotics@FIT group."
AUTHOR = "Michal Spanel"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "geometry-msgs interactive-markers roscpp std-msgs tf visualization-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipa320/cob_command_tools-release/archive/release/melodic/cob_interactive_teleop/0.6.14-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "21897fb0dcd36056b3ec55ebde43a31f"
SRC_URI[sha256sum] = "f05f40166f42486431a4075b08cf1ff4a638d9e29b6aa7b86ca037b5fa997ebe"

ROS_SPN = "cob_command_tools"
S = "${WORKDIR}/cob_command_tools-release-release-melodic-cob_interactive_teleop-0.6.14-1"

inherit catkin
