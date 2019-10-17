DESCRIPTION = "moveit_runtime meta package contains MoveIt! packages that are essential for its runtime (e. g. running MoveIt! on robots)."
AUTHOR = "Isaac I. Y. Saito"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "moveit-core moveit-planners moveit-plugins moveit-ros-manipulation moveit-ros-move-group moveit-ros-perception moveit-ros-planning moveit-ros-planning-interface moveit-ros-warehouse"

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_runtime/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6bb429dd4a970924045180987b449765"
SRC_URI[sha256sum] = "21850a909fa873a1590822fdb3c02425565e40dba912e501987eefb55858763a"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_runtime-1.0.1-0"

inherit catkin
