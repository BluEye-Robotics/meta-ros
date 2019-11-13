DESCRIPTION = ""
AUTHOR = "Shaun Edwards"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "trajectory-msgs pluginlib moveit-core moveit-ros-planning orocos-kdl"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-industrial-release/industrial_core-release/archive/release/melodic/industrial_trajectory_filters/0.7.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1ec17768a4819730d71a49cfdf81f506"
SRC_URI[sha256sum] = "d37a9dfc7999bc81e35123f95e305719c7d07330317d7be34c8efd8150f05a22"

ROS_SPN = "industrial_core"
S = "${WORKDIR}/industrial_core-release-release-melodic-industrial_trajectory_filters-0.7.1-1"

inherit catkin
