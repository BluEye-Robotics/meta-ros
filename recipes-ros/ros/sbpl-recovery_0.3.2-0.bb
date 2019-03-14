DESCRIPTION = "A recovery behavior that uses the sbpl lattice planner and the pose follower to try to plan in full 3D to get the robot out of really tricky situations."
AUTHOR = "Eitan Marder-Eppstein"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "base-local-planner costmap-2d nav-core pluginlib pose-follower roscpp sbpl-lattice-planner tf2-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/navigation_experimental-release/archive/release/melodic/sbpl_recovery/0.3.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0937aefdd774283c5ea80d66e67348a8"
SRC_URI[sha256sum] = "b9c8d77b01c68be444f7e4c5dfa555f55c23076a8e6b060b755ca6883ed5f1be"

ROS_SPN = "navigation_experimental"
S = "${WORKDIR}/navigation_experimental-release-release-melodic-sbpl_recovery-0.3.2-0"

inherit catkin
