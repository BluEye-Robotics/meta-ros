DESCRIPTION = "A recovery behavior that uses the sbpl lattice planner and the pose follower to try to plan in full 3D to get the robot out of really tricky situations."
AUTHOR = "Eitan Marder-Eppstein"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "base-local-planner costmap-2d nav-core pluginlib pose-follower roscpp sbpl-lattice-planner tf2-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/navigation_experimental-release/archive/release/melodic/sbpl_recovery/0.3.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "dc3baa092a52254871db0a0dc00440d8"
SRC_URI[sha256sum] = "24aab134f21caea064f1e410dfc852452977c99f2e064b97203e2e701c31ded5"

ROS_SPN = "navigation_experimental"
S = "${WORKDIR}/navigation_experimental-release-release-melodic-sbpl_recovery-0.3.3-1"

inherit catkin
