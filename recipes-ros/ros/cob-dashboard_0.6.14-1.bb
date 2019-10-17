DESCRIPTION = "cob_dashboard is a modified version of [[pr2_dashboard]]."
AUTHOR = "Alexander Bubeck"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "cob-msgs roslib rospy rqt-gui rqt-robot-dashboard"

SRC_URI = "https://github.com/ipa320/cob_command_tools-release/archive/release/melodic/cob_dashboard/0.6.14-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "706273e49ae1c2ad72c4eb8670d129a7"
SRC_URI[sha256sum] = "7593cb2e8eec98fd4e8d23c9df19ba86d5bf07fff5b21287be46a5359ac422f8"

ROS_SPN = "cob_command_tools"
S = "${WORKDIR}/cob_command_tools-release-release-melodic-cob_dashboard-0.6.14-1"

inherit catkin
