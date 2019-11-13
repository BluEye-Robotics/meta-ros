DESCRIPTION = "An automatically generated package with all the configuration and launch files for using the pr2 with the MoveIt Motion Planning Framework"
AUTHOR = "MoveIt Setup Assistant"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "moveit-ros-move-group joint-state-publisher robot-state-publisher pr2-description"

SRC_URI = "https://github.com/ros-gbp/moveit_pr2-release/archive/release/melodic/pr2_moveit_config/0.7.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8b7ed91cd064d982cfb27b0d04998d41"
SRC_URI[sha256sum] = "543b47308b8307b9cc4a0c08fba6e1a90c8cd7040e0ef01ec5dc746cb3336194"

ROS_SPN = "moveit_pr2"
S = "${WORKDIR}/moveit_pr2-release-release-melodic-pr2_moveit_config-0.7.3-1"

inherit catkin
