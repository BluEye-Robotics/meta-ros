DESCRIPTION = "Plugin based global planner implementing the nav_core2::GlobalPlanner interface."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs nav-2d-msgs nav-2d-utils nav-core2 nav-grid nav-grid-pub-sub nav-msgs pluginlib roscpp visualization-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/DLu/robot_navigation-release/archive/release/melodic/dlux_global_planner/0.2.5-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3ebe7142f3ae892957ebe16f8969e249"
SRC_URI[sha256sum] = "6a30b86cc1610cafd21bf8248d800d59d5dbd510bff2a0a767afca90a58d9cbc"

ROS_SPN = "robot_navigation"
S = "${WORKDIR}/robot_navigation-release-release-melodic-dlux_global_planner-0.2.5-1"

inherit catkin
