DESCRIPTION = "An automatically generated package with all the configuration and launch files for using the panda with the MoveIt! Motion Planning Framework"
AUTHOR = "Mike Lautman"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "franka-description franka-description moveit-ros-move-group moveit-fake-controller-manager moveit-kinematics moveit-planners-ompl moveit-ros-visualization joint-state-publisher robot-state-publisher xacro topic-tools"

RDEPENDS_${PN} = "franka-description moveit-ros-move-group moveit-fake-controller-manager moveit-kinematics moveit-planners-ompl moveit-ros-visualization joint-state-publisher robot-state-publisher xacro topic-tools"

SRC_URI = "https://github.com/ros-gbp/panda_moveit_config-release/archive/release/melodic/panda_moveit_config/0.7.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f7eecd06bc848a6582310516a461715f"
SRC_URI[sha256sum] = "fc91b60881da960606742288b6b3b53aae0b3abe98246d1e1f8c9d1b56126f51"

S = "${WORKDIR}/panda_moveit_config-release-release-melodic-panda_moveit_config-0.7.2-1"

inherit catkin
