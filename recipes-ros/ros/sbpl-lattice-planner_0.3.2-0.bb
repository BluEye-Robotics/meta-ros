DESCRIPTION = "The sbpl_lattice_planner is a global planner plugin for move_base and wraps the SBPL search-based planning library."
AUTHOR = "Michael Phillips"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation costmap-2d geometry-msgs nav-core nav-msgs pluginlib roscpp sbpl tf2"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ros-gbp/navigation_experimental-release/archive/release/melodic/sbpl_lattice_planner/0.3.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "509ed907bf7209247dff1eaf82e56bf9"
SRC_URI[sha256sum] = "e78f8dc5ccf4ffb74f314de47656e49eca331b5cb262d6edfb4ea2729eab56c8"

ROS_SPN = "navigation_experimental"
S = "${WORKDIR}/navigation_experimental-release-release-melodic-sbpl_lattice_planner-0.3.2-0"

inherit catkin
