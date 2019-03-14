DESCRIPTION = "A implementation of a local planner that attempts to follow a plan as closely as possible."
AUTHOR = "Eitan Marder-Eppstein"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "base-local-planner costmap-2d nav-core nav-msgs pluginlib roscpp tf2-geometry-msgs tf2-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/navigation_experimental-release/archive/release/melodic/pose_follower/0.3.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c85a5b61a07f058db844bb5075fe1511"
SRC_URI[sha256sum] = "00042ebe7ca9c50846ca0a358020ec6484b53775106fe2f8539acdf3b400981b"

ROS_SPN = "navigation_experimental"
S = "${WORKDIR}/navigation_experimental-release-release-melodic-pose_follower-0.3.2-0"

inherit catkin
