DESCRIPTION = "An automatically generated package with all the configuration and launch files for using the fetch_urdf with the MoveIt Motion Planning Framework"
AUTHOR = "MoveIt Setup Assistant"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "fetch-description"

RDEPENDS_${PN} = "fetch-ikfast-plugin joint-state-publisher moveit-fake-controller-manager moveit-kinematics moveit-ros-move-group moveit-planners-ompl moveit-python moveit-ros-visualization moveit-simple-controller-manager robot-state-publisher rospy xacro"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_ros-release/archive/release/melodic/fetch_moveit_config/0.8.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7221c8360cc3fdbb5e8788d2ff9b9bca"
SRC_URI[sha256sum] = "4f73b1e8be984225f273f28a4ad0796aff7b509e036f0445ced3453c4476ec18"

ROS_SPN = "fetch_ros"
S = "${WORKDIR}/fetch_ros-release-release-melodic-fetch_moveit_config-0.8.2-1"

inherit catkin
