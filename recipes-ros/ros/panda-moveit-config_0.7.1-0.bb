DESCRIPTION = "An automatically generated package with all the configuration and launch files for using the panda with the MoveIt! Motion Planning Framework"
AUTHOR = "Mike Lautman"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "franka-description franka-description moveit-ros-move-group moveit-fake-controller-manager moveit-kinematics moveit-planners-ompl moveit-ros-visualization joint-state-publisher robot-state-publisher xacro topic-tools"

RDEPENDS_${PN} = "franka-description moveit-ros-move-group moveit-fake-controller-manager moveit-kinematics moveit-planners-ompl moveit-ros-visualization joint-state-publisher robot-state-publisher xacro topic-tools"

SRC_URI = "https://github.com/ros-gbp/panda_moveit_config-release/archive/release/melodic/panda_moveit_config/0.7.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "073c2c24eb19352a6ee2cb80f203b5bd"
SRC_URI[sha256sum] = "01274911d72afb49bda01ff79f7c15aec55668bc0d29342f70d3ea3be5faaa8a"

S = "${WORKDIR}/panda_moveit_config-release-release-melodic-panda_moveit_config-0.7.1-0"

inherit catkin
