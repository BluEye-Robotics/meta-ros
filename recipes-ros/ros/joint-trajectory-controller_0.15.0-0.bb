DESCRIPTION = "Controller for executing joint-space trajectories on a group of joints."
AUTHOR = "Adolfo Rodriguez Tsouroukdissian"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules actionlib angles control-msgs control-toolbox controller-interface hardware-interface realtime-tools roscpp trajectory-msgs urdf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/melodic/joint_trajectory_controller/0.15.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "05a70fa119fa4252b17de25abe549aef"
SRC_URI[sha256sum] = "d7624bbbca732b5e17524908ec9e6214c448aa9cc33ffddb3538e9269c6bd313"

ROS_SPN = "ros_controllers"
S = "${WORKDIR}/ros_controllers-release-release-melodic-joint_trajectory_controller-0.15.0-0"

inherit catkin
