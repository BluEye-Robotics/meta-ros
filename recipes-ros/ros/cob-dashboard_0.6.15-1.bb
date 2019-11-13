DESCRIPTION = "cob_dashboard is a modified version of [[pr2_dashboard]]."
AUTHOR = "Alexander Bubeck"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "cob-msgs roslib rospy rqt-gui rqt-robot-dashboard"

SRC_URI = "https://github.com/ipa320/cob_command_tools-release/archive/release/melodic/cob_dashboard/0.6.15-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "00d3edabf5eb9566cf17d977f694f896"
SRC_URI[sha256sum] = "2a34b89fda4cc72d128bf661db6d259658942ae505f3a78d010cc9d44c9bcb25"

ROS_SPN = "cob_command_tools"
S = "${WORKDIR}/cob_command_tools-release-release-melodic-cob_dashboard-0.6.15-1"

inherit catkin
