DESCRIPTION = "MoveIt! interface to OMPL"
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "moveit-core ompl moveit-ros-planning dynamic-reconfigure rosconsole roscpp tf2-ros pluginlib"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_planners_ompl/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "22587c333e4073336b7a072191769213"
SRC_URI[sha256sum] = "ff42c067ffeea4f9430e365946b5a958bec447d2e0e5a4fee66eee6a306e51df"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_planners_ompl-1.0.1-0"

inherit catkin
