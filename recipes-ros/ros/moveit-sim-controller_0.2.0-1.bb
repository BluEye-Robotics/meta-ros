DESCRIPTION = "A simulation interface for a hardware interface for ros_control, and loads default joint values from SRDF"
AUTHOR = "Dave Coleman"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "moveit-core moveit-ros-planning ros-control-boilerplate rosparam-shortcuts roscpp roslint moveit-core moveit-ros-planning ros-control-boilerplate rosparam-shortcuts roscpp"

RDEPENDS_${PN} = "moveit-core moveit-ros-planning ros-control-boilerplate rosparam-shortcuts roscpp"

SRC_URI = "https://github.com/PickNikRobotics/moveit_sim_controller-release/archive/release/melodic/moveit_sim_controller/0.2.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c59e5e36f158a3b8bdf4a09050f001a6"
SRC_URI[sha256sum] = "86cfd592c05305bb60387de3f33bcc248b800f29d8e6f7aeba371349da86372e"

S = "${WORKDIR}/moveit_sim_controller-release-release-melodic-moveit_sim_controller-0.2.0-1"

inherit catkin
