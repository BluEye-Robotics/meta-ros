DESCRIPTION = "The interface for using CHOMP within MoveIt!"
AUTHOR = "Gil Jones"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp moveit-core pluginlib chomp-motion-planner"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_planners_chomp/1.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cdc06303a34735d8c4f951e5896ec9f0"
SRC_URI[sha256sum] = "1da3d5449339b872017fe01d4592569a79c24dbcea3e64d2c045f2f1393ea35d"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_planners_chomp-1.0.2-1"

inherit catkin
