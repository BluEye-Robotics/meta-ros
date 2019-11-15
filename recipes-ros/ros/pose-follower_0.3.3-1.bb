DESCRIPTION = "A implementation of a local planner that attempts to follow a plan as closely as possible."
AUTHOR = "Eitan Marder-Eppstein"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "base-local-planner costmap-2d dynamic-reconfigure nav-core nav-msgs pluginlib roscpp tf2-geometry-msgs tf2-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/navigation_experimental-release/archive/release/melodic/pose_follower/0.3.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "401fb168a2b51ebd65a68946afc4349d"
SRC_URI[sha256sum] = "d41dd5aab341f0af1b8eec70fb7db581f1857cf8d0d5574f5039f53288b3761b"

ROS_SPN = "navigation_experimental"
S = "${WORKDIR}/navigation_experimental-release-release-melodic-pose_follower-0.3.3-1"

inherit catkin
