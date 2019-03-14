DESCRIPTION = "Components of MoveIt! that use ROS"
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "moveit-ros-perception moveit-ros-planning moveit-ros-warehouse moveit-ros-benchmarks moveit-ros-robot-interaction moveit-ros-planning-interface moveit-ros-visualization moveit-ros-manipulation moveit-ros-move-group"

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_ros/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d7d5b27d6b8ce40b79a541f622498fd2"
SRC_URI[sha256sum] = "1e3b1c3ea482401d2aca3d1c47c4d834ed78925004668ac7e50567519ec31c92"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_ros-1.0.1-0"

inherit catkin
