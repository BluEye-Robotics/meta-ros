DESCRIPTION = "The pr2_tuck_arms_action package"
AUTHOR = "Wim Meeussen"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs pr2-common-action-msgs pr2-controllers-msgs rospy trajectory-msgs actionlib actionlib-msgs pr2-common-action-msgs pr2-controllers-msgs rospy trajectory-msgs"

RDEPENDS_${PN} = "actionlib actionlib-msgs pr2-common-action-msgs pr2-controllers-msgs rospy trajectory-msgs"

SRC_URI = "https://github.com/pr2-gbp/pr2_common_actions-release/archive/release/melodic/pr2_tuck_arms_action/0.0.11-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bd6d5182c36fa547efef0afa2277f7ec"
SRC_URI[sha256sum] = "12d791a5cb70ca8bce9093e6dddc5cd0fc718b1d440f62c6006071bd736629e7"

ROS_SPN = "pr2_common_actions"
S = "${WORKDIR}/pr2_common_actions-release-release-melodic-pr2_tuck_arms_action-0.0.11-0"

inherit catkin
