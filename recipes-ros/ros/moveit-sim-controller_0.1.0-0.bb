DESCRIPTION = "A simulation interface for a hardware interface for ros_control, and loads default joint values from SRDF"
AUTHOR = "Dave Coleman"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "moveit-core moveit-ros-planning ros-control-boilerplate rosparam-shortcuts roscpp roslint moveit-core moveit-ros-planning ros-control-boilerplate rosparam-shortcuts roscpp"

RDEPENDS_${PN} = "moveit-core moveit-ros-planning ros-control-boilerplate rosparam-shortcuts roscpp"

SRC_URI = "https://github.com/PickNikRobotics/moveit_sim_controller-release/archive/release/melodic/moveit_sim_controller/0.1.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "420ce6591daa6529c3becdf0686abfa4"
SRC_URI[sha256sum] = "3d7a3062afc99ff36fa906e8796297a7ac3e1a1dea416d71a06ce22bdbfe18e9"

S = "${WORKDIR}/moveit_sim_controller-release-release-melodic-moveit_sim_controller-0.1.0-0"

inherit catkin
