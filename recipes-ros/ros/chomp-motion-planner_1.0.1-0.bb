DESCRIPTION = "chomp_motion_planner"
AUTHOR = "Gil Jones"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp moveit-core"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/chomp_motion_planner/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f3b1e76b50470e9007fc96119045ff30"
SRC_URI[sha256sum] = "1f5bd973706dc3c014bb87d0e75f202e83db8d8d0883774f9eda58085df2b895"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-chomp_motion_planner-1.0.1-0"

inherit catkin
