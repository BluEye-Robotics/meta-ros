DESCRIPTION = "The move_group node for MoveIt"
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib moveit-core moveit-ros-planning roscpp tf2 tf2-geometry-msgs tf2-ros pluginlib std-srvs"

RDEPENDS_${PN} = "moveit-kinematics"

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_ros_move_group/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2426f400529433b72cf1eee92c30f69b"
SRC_URI[sha256sum] = "0b67a53e3f9ac332042ca174e04388c21a556b4f0eb0b1856001b86426294be5"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_ros_move_group-1.0.1-0"

inherit catkin
