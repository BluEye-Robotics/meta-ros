DESCRIPTION = "Components of MoveIt! connecting to perception"
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libeigen moveit-core roscpp rosconsole urdf message-filters octomap pluginlib image-transport    cv-bridge sensor-msgs moveit-msgs object-recognition-msgs tf2 tf2-eigen tf2-geometry-msgs tf2-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_ros_perception/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "afd4d7413a080db3686edaa75aa2eda8"
SRC_URI[sha256sum] = "17224556fc107529db910afacec08cdd3c00af38e518e93c878bdc0d7b0faa5a"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_ros_perception-1.0.1-0"

inherit catkin
