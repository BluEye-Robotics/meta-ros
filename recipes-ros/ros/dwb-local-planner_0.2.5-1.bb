DESCRIPTION = "Plugin based local planner implementing the nav_core2::LocalPlanner interface."
AUTHOR = "David V. Lu!!"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "dwb-msgs geometry-msgs nav-2d-msgs nav-2d-utils nav-core2 nav-msgs pluginlib roscpp sensor-msgs tf visualization-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/DLu/robot_navigation-release/archive/release/melodic/dwb_local_planner/0.2.5-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3ab23f5bec607e143481bb4d7d14881b"
SRC_URI[sha256sum] = "ff619b8d1853a88a117ab1e4efae8e9ba011e15875be81cda989e08360c7014a"

ROS_SPN = "robot_navigation"
S = "${WORKDIR}/robot_navigation-release-release-melodic-dwb_local_planner-0.2.5-1"

inherit catkin
