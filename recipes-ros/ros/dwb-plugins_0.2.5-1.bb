DESCRIPTION = "Standard implementations of the GoalChecker and TrajectoryGenerators for dwb_local_planner"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles dwb-local-planner dynamic-reconfigure nav-2d-msgs nav-2d-utils nav-core2 pluginlib roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/DLu/robot_navigation-release/archive/release/melodic/dwb_plugins/0.2.5-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6e886338b920b771c66a65315cfc190c"
SRC_URI[sha256sum] = "b329ba183c9e033d2b85423f19ebd060d36df1f05ae4d425b46a868ca87900b1"

ROS_SPN = "robot_navigation"
S = "${WORKDIR}/robot_navigation-release-release-melodic-dwb_plugins-0.2.5-1"

inherit catkin
