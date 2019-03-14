DESCRIPTION = "Controller for executing joint-space trajectories on a group of joints."
AUTHOR = "Adolfo Rodriguez Tsouroukdissian"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules actionlib angles control-msgs control-toolbox controller-interface hardware-interface realtime-tools roscpp trajectory-msgs urdf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/melodic/joint_trajectory_controller/0.14.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b4fc920c1ebeef12451a5dfe697d9a3c"
SRC_URI[sha256sum] = "bf731b8b86b30eca8a8e567a113a812dcf4eb25a352be14b1edb776782a5b522"

ROS_SPN = "ros_controllers"
S = "${WORKDIR}/ros_controllers-release-release-melodic-joint_trajectory_controller-0.14.3-0"

inherit catkin
