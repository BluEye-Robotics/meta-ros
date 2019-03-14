DESCRIPTION = "Components of MoveIt! that offer simpler interfaces to planning and execution"
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libeigen moveit-ros-planning moveit-ros-warehouse moveit-ros-move-group moveit-ros-manipulation roscpp rospy rosconsole actionlib geometry-msgs moveit-msgs tf2 tf2-eigen tf2-geometry-msgs tf2-ros python"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_ros_planning_interface/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f4ade34ae551bd3a4d8a0e960939405f"
SRC_URI[sha256sum] = "3d9447fa2f84157ef3613cc32133286a7475fee7410a3bdbaa6653833aa485f1"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_ros_planning_interface-1.0.1-0"

inherit catkin
