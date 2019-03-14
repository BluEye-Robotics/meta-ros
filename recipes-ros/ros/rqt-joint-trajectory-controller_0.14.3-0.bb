DESCRIPTION = "Graphical frontend for interacting with joint_trajectory_controller instances."
AUTHOR = "Adolfo Rodriguez Tsouroukdissian"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "control-msgs controller-manager-msgs trajectory-msgs rospy rqt-gui rqt-gui-py"

SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/melodic/rqt_joint_trajectory_controller/0.14.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e8c0fb0c58db63dfc9e7300ef1f6a0b7"
SRC_URI[sha256sum] = "1b94493ec19a1df23d2d8f51dd7edd53bb8481ff389018b9ca2681c575493706"

ROS_SPN = "ros_controllers"
S = "${WORKDIR}/ros_controllers-release-release-melodic-rqt_joint_trajectory_controller-0.14.3-0"

inherit catkin
