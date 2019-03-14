DESCRIPTION = "The pilz_trajectory_generation package containing the MoveIt! plugin pilz_command_planner."
AUTHOR = ""
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "orocos-kdl roscpp moveit-msgs moveit-core moveit-ros-planning moveit-ros-move-group tf2 tf2-geometry-msgs tf2-eigen eigen-conversions pluginlib pilz-extensions pilz-msgs moveit-ros-planning-interface pilz-testutils kdl-conversions orocos-kdl roscpp moveit-msgs moveit-core moveit-ros-planning moveit-ros-move-group moveit-commander prbt-ikfast-manipulator-plugin pilz-extensions pilz-msgs tf2 tf2-geometry-msgs message-runtime moveit-ros-planning-interface"

RDEPENDS_${PN} = "orocos-kdl roscpp moveit-msgs moveit-core moveit-ros-planning moveit-ros-move-group moveit-commander prbt-ikfast-manipulator-plugin pilz-extensions pilz-msgs tf2 tf2-geometry-msgs message-runtime moveit-ros-planning-interface"

SRC_URI = "https://github.com/PilzDE/pilz_industrial_motion-release/archive/release/melodic/pilz_trajectory_generation/0.4.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b394fd888718cc6970dd8555f4a8e06c"
SRC_URI[sha256sum] = "936e4bd50609f103ea922cde588a32fd0b1ea5e2eaaf685338d619d9551a61db"

ROS_SPN = "pilz_industrial_motion"
S = "${WORKDIR}/pilz_industrial_motion-release-release-melodic-pilz_trajectory_generation-0.4.2-0"

inherit catkin
