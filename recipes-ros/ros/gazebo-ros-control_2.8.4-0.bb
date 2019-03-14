DESCRIPTION = "gazebo_ros_control"
AUTHOR = "Jonathan Bohren"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "gazebo-dev roscpp std-msgs control-toolbox controller-manager pluginlib hardware-interface transmission-interface joint-limits-interface urdf angles"

RDEPENDS_${PN} = "gazebo-ros"

SRC_URI = "https://github.com/ros-gbp/gazebo_ros_pkgs-release/archive/release/melodic/gazebo_ros_control/2.8.4-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4d416c333ed56ba010fe6be01efad2cc"
SRC_URI[sha256sum] = "bf13aeb1f6a28b8510e759106a5f8d5b0c34d2e05dee6078e1bd12447fd79727"

ROS_SPN = "gazebo_ros_pkgs"
S = "${WORKDIR}/gazebo_ros_pkgs-release-release-melodic-gazebo_ros_control-2.8.4-0"

inherit catkin
