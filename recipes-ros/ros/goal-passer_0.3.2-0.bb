DESCRIPTION = "A global planner plugin for move_base that simply passes the target pose on as a global plan. Useful for debugging local planners."
AUTHOR = "Eitan Marder-Eppstein"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "costmap-2d nav-core pluginlib roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/navigation_experimental-release/archive/release/melodic/goal_passer/0.3.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b8e82b05990fa9c7a51a507b2f1c6cb1"
SRC_URI[sha256sum] = "9c648c6dfebf422fd014074cd0a9fc095208ff674436da5729f8f515c4386189"

ROS_SPN = "navigation_experimental"
S = "${WORKDIR}/navigation_experimental-release-release-melodic-goal_passer-0.3.2-0"

inherit catkin
