DESCRIPTION = "joint_trajectory_action_tools"
AUTHOR = "Melonee Wise"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslib rospy joint-trajectory-action trajectory-msgs pr2-controllers-msgs roslib rospy joint-trajectory-action trajectory-msgs pr2-controllers-msgs"

RDEPENDS_${PN} = "roslib rospy joint-trajectory-action trajectory-msgs pr2-controllers-msgs"

SRC_URI = "https://github.com/pr2-gbp/pr2_common_actions-release/archive/release/melodic/joint_trajectory_action_tools/0.0.11-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "65ecb91117f30d09a78756cb00943913"
SRC_URI[sha256sum] = "cff217c086340f75d87f968fe96ab08c5485fb39779aa8d1af8699bcb993f356"

ROS_SPN = "pr2_common_actions"
S = "${WORKDIR}/pr2_common_actions-release-release-melodic-joint_trajectory_action_tools-0.0.11-0"

inherit catkin
