DESCRIPTION = "Move the pr2 arm using inverse kinematics"
AUTHOR = "Wim Meeusen"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib roscpp actionlib-msgs geometry-msgs pr2-controllers-msgs pr2-common-action-msgs tf urdf actionlib roscpp actionlib-msgs geometry-msgs pr2-controllers-msgs pr2-common-action-msgs tf urdf"

RDEPENDS_${PN} = "actionlib roscpp actionlib-msgs geometry-msgs pr2-controllers-msgs pr2-common-action-msgs tf urdf"

SRC_URI = "https://github.com/pr2-gbp/pr2_common_actions-release/archive/release/melodic/pr2_arm_move_ik/0.0.11-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "78ff63a3e03cce28bf99d4a04b562c84"
SRC_URI[sha256sum] = "8051d2f766e269e465921bb3b85eb08ab5a8f24c1e9e0f2ee7422665e5f23eee"

ROS_SPN = "pr2_common_actions"
S = "${WORKDIR}/pr2_common_actions-release-release-melodic-pr2_arm_move_ik-0.0.11-0"

inherit catkin
