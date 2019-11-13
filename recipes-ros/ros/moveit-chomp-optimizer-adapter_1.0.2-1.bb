DESCRIPTION = "MoveIt planning request adapter utilizing chomp for solution optimization"
AUTHOR = "Raghavender Sahdev"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "moveit-core chomp-motion-planner pluginlib"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_chomp_optimizer_adapter/1.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e5be4520865c8b75a2619cd4b6ec8268"
SRC_URI[sha256sum] = "4bb3527f09b0eacd6fb565b2f967f166c4c5e7cc38f94861701e61e6d3fc82ea"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_chomp_optimizer_adapter-1.0.2-1"

inherit catkin
