DESCRIPTION = "The pilz_trajectory_generation package containing the MoveIt! plugin pilz_command_planner."
AUTHOR = ""
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "orocos-kdl roscpp moveit-msgs moveit-core moveit-ros-planning moveit-ros-move-group tf2 tf2-geometry-msgs pilz-msgs moveit-ros-planning-interface eigen-conversions pilz-extensions tf2-eigen pluginlib kdl-conversions"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/PilzDE/pilz_industrial_motion-release/archive/release/melodic/pilz_trajectory_generation/0.4.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "21c3cd828500deddc6d58bff5928f173"
SRC_URI[sha256sum] = "6c9a20d2e57d28821ccb0245f0a872a29937e489bface23b65124df0642f311a"

ROS_SPN = "pilz_industrial_motion"
S = "${WORKDIR}/pilz_industrial_motion-release-release-melodic-pilz_trajectory_generation-0.4.4-1"

inherit catkin
