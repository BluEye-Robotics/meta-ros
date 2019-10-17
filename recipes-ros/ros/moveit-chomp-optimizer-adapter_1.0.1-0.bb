DESCRIPTION = "MoveIt planning request adapter utilizing chomp for solution optimization"
AUTHOR = "Raghavender Sahdev"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "moveit-core chomp-motion-planner pluginlib"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_chomp_optimizer_adapter/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9ca6c3991cd031b277cd4f25b952235a"
SRC_URI[sha256sum] = "b9065477079418a14d4a7ba689e48b048557070f3abe99b9ebe80e239d1cf461"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_chomp_optimizer_adapter-1.0.1-0"

inherit catkin
