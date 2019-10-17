DESCRIPTION = "Components of MoveIt! connecting to perception"
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libeigen moveit-core roscpp rosconsole urdf message-filters octomap pluginlib image-transport    cv-bridge sensor-msgs moveit-msgs object-recognition-msgs tf2 tf2-eigen tf2-geometry-msgs tf2-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_ros_perception/1.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "dc8bcca13027905b07565375e4f0060b"
SRC_URI[sha256sum] = "0a8638101732055e5933e49417462de4594a41c707c520e90704f920d6452c8e"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_ros_perception-1.0.2-1"

inherit catkin
