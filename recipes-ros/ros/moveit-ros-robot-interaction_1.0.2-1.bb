DESCRIPTION = "Components of MoveIt! that offer interaction via interactive markers"
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "moveit-ros-planning roscpp tf2 tf2-eigen tf2-geometry-msgs tf2-ros interactive-markers"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_ros_robot_interaction/1.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ca2eaed564bc35b92878e353e7b37fea"
SRC_URI[sha256sum] = "3332b6537faed0c98ece9ea5d64d1b6c3253fa4b3b2ee738fa9bee14b2c772c6"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_ros_robot_interaction-1.0.2-1"

inherit catkin
