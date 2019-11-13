DESCRIPTION = "A collection of navigation plugins and tools: Various recovery behaviors, local and global planner plugins for move_base, a teleop filter for obstacle avoidance, a simple control-based move_base replacement etc."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "assisted-teleop goal-passer pose-base-controller pose-follower sbpl-lattice-planner sbpl-recovery twist-recovery"

SRC_URI = "https://github.com/ros-gbp/navigation_experimental-release/archive/release/melodic/navigation_experimental/0.3.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5089fc484fd7aa6e9fdcccf8bb0400cd"
SRC_URI[sha256sum] = "dfb18ed3954940c6f6416c2f9e2ab9a38a01327aebe7cb19b8e83cfe53157c0c"

S = "${WORKDIR}/navigation_experimental-release-release-melodic-navigation_experimental-0.3.3-1"

inherit catkin
