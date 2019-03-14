DESCRIPTION = "A collection of tests for checking the validity and completeness of global planners."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "map-server nav-core2 nav-msgs pluginlib roscpp yaml-cpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/DLu/robot_navigation-release/archive/release/melodic/global_planner_tests/0.2.5-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d6ee89c98f9bfd7e38c4dff02d2b0529"
SRC_URI[sha256sum] = "39e04b13a621dc4fd2ceec66debbb65c93034d192a2d238c26fc425a67325074"

ROS_SPN = "robot_navigation"
S = "${WORKDIR}/robot_navigation-release-release-melodic-global_planner_tests-0.2.5-1"

inherit catkin
