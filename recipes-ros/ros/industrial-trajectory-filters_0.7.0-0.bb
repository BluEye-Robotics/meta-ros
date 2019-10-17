DESCRIPTION = ""
AUTHOR = "Shaun Edwards"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "trajectory-msgs pluginlib moveit-core moveit-ros-planning orocos-kdl trajectory-msgs pluginlib moveit-core moveit-ros-planning orocos-kdl"

RDEPENDS_${PN} = "trajectory-msgs pluginlib moveit-core moveit-ros-planning orocos-kdl"

SRC_URI = "https://github.com/ros-industrial-release/industrial_core-release/archive/release/melodic/industrial_trajectory_filters/0.7.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2c6ece9d63538f8055b995b9675f2867"
SRC_URI[sha256sum] = "ce903b69e6712c8ebe654ab523ee627a57881be2c218b5fdb2330d8150520298"

ROS_SPN = "industrial_core"
S = "${WORKDIR}/industrial_core-release-release-melodic-industrial_trajectory_filters-0.7.0-0"

inherit catkin
