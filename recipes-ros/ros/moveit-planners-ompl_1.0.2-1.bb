DESCRIPTION = "MoveIt! interface to OMPL"
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "moveit-core ompl moveit-ros-planning dynamic-reconfigure rosconsole roscpp tf2-ros pluginlib"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_planners_ompl/1.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "687d2817f3dbf28cfd16985b728cf626"
SRC_URI[sha256sum] = "57dbd0aaf20ebe0619ed16d10a7835fee61df22ad5438da662dcbe71c670bdce"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_planners_ompl-1.0.2-1"

inherit catkin
