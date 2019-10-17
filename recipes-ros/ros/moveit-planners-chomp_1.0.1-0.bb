DESCRIPTION = "The interface for using CHOMP within MoveIt!"
AUTHOR = "Gil Jones"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp moveit-core pluginlib chomp-motion-planner"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_planners_chomp/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "65a09659bb93a475a7e83048a6fc537a"
SRC_URI[sha256sum] = "2b2fb87420adf3908b59b71bc36bc9a3026f05667d7c84a6ae68a2f572df74c5"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_planners_chomp-1.0.1-0"

inherit catkin
