DESCRIPTION = "A global planner plugin for move_base that simply passes the target pose on as a global plan. Useful for debugging local planners."
AUTHOR = "Eitan Marder-Eppstein"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "costmap-2d nav-core pluginlib roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/navigation_experimental-release/archive/release/melodic/goal_passer/0.3.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "404fc5b163742e5b67a4b569ffb34703"
SRC_URI[sha256sum] = "aa5365192935a8a55a6695d24dfb17b40314c667637c986a03b5e7161cc58951"

ROS_SPN = "navigation_experimental"
S = "${WORKDIR}/navigation_experimental-release-release-melodic-goal_passer-0.3.3-1"

inherit catkin
