DESCRIPTION = "The pr2_common_action_msgs package"
AUTHOR = "Wim Meeussen"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs geometry-msgs sensor-msgs message-generation message-runtime actionlib-msgs geometry-msgs sensor-msgs"

RDEPENDS_${PN} = "message-runtime actionlib-msgs geometry-msgs sensor-msgs"

SRC_URI = "https://github.com/pr2-gbp/pr2_common_actions-release/archive/release/melodic/pr2_common_action_msgs/0.0.11-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1bc34dfe83afd2a52ddcdab680eaca33"
SRC_URI[sha256sum] = "65824648cd967a5c46b6861c1d0e9c76920d68ee4e28aff2783962c87f21dc3f"

ROS_SPN = "pr2_common_actions"
S = "${WORKDIR}/pr2_common_actions-release-release-melodic-pr2_common_action_msgs-0.0.11-0"

inherit catkin
