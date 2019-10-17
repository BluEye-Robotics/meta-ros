DESCRIPTION = "Components of MoveIt! that offer interaction via interactive markers"
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "moveit-ros-planning roscpp tf2 tf2-eigen tf2-geometry-msgs tf2-ros interactive-markers"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_ros_robot_interaction/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7d70834235459dcfd016c940e62d0fd8"
SRC_URI[sha256sum] = "7667565bf9ad5150421244374497baff91b46bc5c8ed9dd3f53e2f854480a43d"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_ros_robot_interaction-1.0.1-0"

inherit catkin
