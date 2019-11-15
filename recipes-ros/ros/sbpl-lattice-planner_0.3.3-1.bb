DESCRIPTION = "The sbpl_lattice_planner is a global planner plugin for move_base and wraps the SBPL search-based planning library."
AUTHOR = "Michael Phillips"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation costmap-2d geometry-msgs nav-core nav-msgs pluginlib roscpp sbpl tf2"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ros-gbp/navigation_experimental-release/archive/release/melodic/sbpl_lattice_planner/0.3.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ee8effe4f579a26953f8aed2c4a1e550"
SRC_URI[sha256sum] = "efbfed3e3ac9b17303e77d216eeb675137a63ec6b524088191e4ca06207588c2"

ROS_SPN = "navigation_experimental"
S = "${WORKDIR}/navigation_experimental-release-release-melodic-sbpl_lattice_planner-0.3.3-1"

inherit catkin
