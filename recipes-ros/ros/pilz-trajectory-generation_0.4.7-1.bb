DESCRIPTION = "The pilz_trajectory_generation package containing the MoveIt! plugin pilz_command_planner."
AUTHOR = ""
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "orocos-kdl roscpp moveit-msgs moveit-core moveit-ros-planning moveit-ros-move-group tf2 tf2-geometry-msgs pilz-msgs moveit-ros-planning-interface eigen-conversions pilz-extensions tf2-eigen pluginlib kdl-conversions"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/PilzDE/pilz_industrial_motion-release/archive/release/melodic/pilz_trajectory_generation/0.4.7-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ce7306d0ce7dfd4145dba4ca6f9bf2f2"
SRC_URI[sha256sum] = "df5cf92babaf0826cc856e961a53b82ca28c19d2ae3131817a5bd1a8900fe19d"

ROS_SPN = "pilz_industrial_motion"
S = "${WORKDIR}/pilz_industrial_motion-release-release-melodic-pilz_trajectory_generation-0.4.7-1"

inherit catkin
