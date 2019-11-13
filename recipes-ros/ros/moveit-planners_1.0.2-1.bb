DESCRIPTION = "Metapacakge that installs all available planners for MoveIt"
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "chomp-motion-planner moveit-planners-chomp moveit-planners-ompl"

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_planners/1.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "49ebb67764191d8c3a9b68f6677212f9"
SRC_URI[sha256sum] = "d8a75310db98a3d553e69a95401e22b704290dbad14be446fa3c0b1aa19e30bf"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_planners-1.0.2-1"

inherit catkin
