DESCRIPTION = "Metapacakge that installs all available planners for MoveIt"
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "chomp-motion-planner moveit-planners-chomp moveit-planners-ompl"

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_planners/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e443001750115a3e7e449e33dc838c78"
SRC_URI[sha256sum] = "7b6c3933c3a38cbe11dbf000c0de6e20ad752ce7718801039d28353ef6fbe02e"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_planners-1.0.1-0"

inherit catkin
