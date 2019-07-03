DESCRIPTION = "Launch scripts for simulating the PR2 in"
AUTHOR = "John Hsu"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "pr2-gazebo-plugins gazebo-plugins gazebo pr2-gazebo-plugins gazebo-plugins gazebo pr2-description diagnostic-aggregator pr2-dashboard-aggregator pr2-controller-configuration-gazebo robot-mechanism-controllers pr2-mechanism-controllers pr2-head-action joint-trajectory-action pr2-gripper-action single-joint-position-action stereo-image-proc image-proc robot-pose-ekf tf2-ros topic-tools xacro robot-state-publisher robot-pose-ekf pr2-controller-manager gazebo-ros rostopic pr2-msgs geometry-msgs rospy std-msgs fingertip-pressure"

RDEPENDS_${PN} = "pr2-gazebo-plugins gazebo-plugins gazebo pr2-description diagnostic-aggregator pr2-dashboard-aggregator pr2-controller-configuration-gazebo robot-mechanism-controllers pr2-mechanism-controllers pr2-head-action joint-trajectory-action pr2-gripper-action single-joint-position-action stereo-image-proc image-proc robot-pose-ekf tf2-ros topic-tools xacro robot-state-publisher robot-pose-ekf pr2-controller-manager gazebo-ros rostopic pr2-msgs geometry-msgs rospy std-msgs fingertip-pressure"

SRC_URI = "https://github.com/pr2-gbp/pr2_simulator-release/archive/release/melodic/pr2_gazebo/2.0.14-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "677819668fecbcf7feb4048c8aa4f7e2"
SRC_URI[sha256sum] = "65a61813255f0e2fd52200aceb94b18f0e19ed5e4f9c07c521558541015392a9"

ROS_SPN = "pr2_simulator"
S = "${WORKDIR}/pr2_simulator-release-release-melodic-pr2_gazebo-2.0.14-0"

inherit catkin
