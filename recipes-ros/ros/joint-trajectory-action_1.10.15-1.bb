DESCRIPTION = "The joint_trajectory_action is a node that exposes an action interface to a joint trajectory controller."
AUTHOR = "Stuart Glaser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp trajectory-msgs pr2-controllers-msgs actionlib roscpp trajectory-msgs pr2-controllers-msgs actionlib"

RDEPENDS_${PN} = "roscpp trajectory-msgs pr2-controllers-msgs actionlib"

SRC_URI = "https://github.com/pr2-gbp/pr2_controllers-release/archive/release/melodic/joint_trajectory_action/1.10.15-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6ea28cab20672c8fa540a4ba86c1e0d3"
SRC_URI[sha256sum] = "834effaf0b27fe98bd5f1e7815fbe17d3fae153ba4e12135dbbb4eb1d20d571f"

ROS_SPN = "pr2_controllers"
S = "${WORKDIR}/pr2_controllers-release-release-melodic-joint_trajectory_action-1.10.15-1"

inherit catkin
