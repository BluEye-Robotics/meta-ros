DESCRIPTION = "navfn provides a fast interpolated navigation function that can be used to create plans for a mobile base. The planner assumes a circular robot and operates on a costmap to find a minimum cost plan from a start point to an end point in a grid. The navigation function is computed with Dijkstra's algorithm, but support for an A* heuristic may also be added in the near future. navfn also provides a ROS wrapper for the navfn planner that adheres to the nav_core::BaseGlobalPlanner interface specified in"
AUTHOR = "Kurt Konolige"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=22;endline=22;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "cmake-modules message-generation  costmap-2d geometry-msgs nav-core nav-msgs pluginlib rosconsole roscpp sensor-msgs tf2-ros visualization-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/melodic/navfn/1.16.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "aa7400fee80ad8508544806963a8ea6a"
SRC_URI[sha256sum] = "d4795ca8a10f1cb8d8ff7a2949637be11bb6e14ca0d2878731cdd82d20acb271"

ROS_SPN = "navigation"
S = "${WORKDIR}/navigation-release-release-melodic-navfn-1.16.2-0"

inherit catkin
