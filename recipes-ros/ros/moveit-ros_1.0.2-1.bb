DESCRIPTION = "Components of MoveIt! that use ROS"
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "moveit-ros-perception moveit-ros-planning moveit-ros-warehouse moveit-ros-benchmarks moveit-ros-robot-interaction moveit-ros-planning-interface moveit-ros-visualization moveit-ros-manipulation moveit-ros-move-group"

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_ros/1.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "aae21f3886adbd212e55e9f7b2fcccf5"
SRC_URI[sha256sum] = "8b551243c80a94f093cc3dfb6039e7f18ff80de60972a1e942bb2c2f9ff10fd8"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_ros-1.0.2-1"

inherit catkin
