DESCRIPTION = "ros_control controller manager interface for MoveIt!"
AUTHOR = "Mathias Lüdtke"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib controller-manager-msgs moveit-core moveit-simple-controller-manager pluginlib trajectory-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_ros_control_interface/1.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "66c5a8943f2f4e075ecb2cf7bcfe2c35"
SRC_URI[sha256sum] = "94c405b03bee2a9f793c5350d25551c215e10102cb3360b465f14030f96992d7"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_ros_control_interface-1.0.2-1"

inherit catkin
