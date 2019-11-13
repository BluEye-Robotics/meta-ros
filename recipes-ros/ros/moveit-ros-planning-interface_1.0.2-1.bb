DESCRIPTION = "Components of MoveIt! that offer simpler interfaces to planning and execution"
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libeigen moveit-ros-planning moveit-ros-warehouse moveit-ros-move-group moveit-ros-manipulation roscpp rospy rosconsole actionlib geometry-msgs moveit-msgs tf2 tf2-eigen tf2-geometry-msgs tf2-ros python eigenpy"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_ros_planning_interface/1.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "746eb86b59602896ec315b0ecd4fa18c"
SRC_URI[sha256sum] = "f68c495c75d0c3ee11bf1e8235f63df94439df395eb19a9265baf8a70356b57f"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_ros_planning_interface-1.0.2-1"

inherit catkin
