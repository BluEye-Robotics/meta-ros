DESCRIPTION = "ros_control controller manager interface for MoveIt!"
AUTHOR = "Mathias Lüdtke"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib controller-manager-msgs moveit-core moveit-simple-controller-manager pluginlib trajectory-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_ros_control_interface/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0eb4ec733d0378aa45c2e0e2cb1128ff"
SRC_URI[sha256sum] = "ab7d709853069646411c7051fabf921f2734dbf55858457e9525024f21877e20"

ROS_SPN = "moveit"
S = "${WORKDIR}/moveit-release-release-melodic-moveit_ros_control_interface-1.0.1-0"

inherit catkin
