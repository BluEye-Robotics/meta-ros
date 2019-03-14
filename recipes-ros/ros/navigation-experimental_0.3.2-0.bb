DESCRIPTION = "A collection of navigation plugins and tools: Various recovery behaviors, local and global planner plugins for move_base, a teleop filter for obstacle avoidance, a simple control-based move_base replacement etc."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "assisted-teleop goal-passer pose-base-controller pose-follower sbpl-lattice-planner sbpl-recovery twist-recovery"

SRC_URI = "https://github.com/ros-gbp/navigation_experimental-release/archive/release/melodic/navigation_experimental/0.3.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3ac9b733135d014a9ff43b07b528f777"
SRC_URI[sha256sum] = "79834c6c9f70411161eb2604ba1e6b13ecd2d28c89eeefd583530f237a8f851f"

S = "${WORKDIR}/navigation_experimental-release-release-melodic-navigation_experimental-0.3.2-0"

inherit catkin
