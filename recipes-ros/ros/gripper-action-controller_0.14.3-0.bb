DESCRIPTION = "The gripper_action_controller package"
AUTHOR = "Sachin Chitta"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib angles cmake-modules control-msgs control-toolbox controller-interface controller-manager hardware-interface realtime-tools roscpp trajectory-msgs urdf xacro"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/melodic/gripper_action_controller/0.14.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "40c3a51f8d7aa13cb09542d781a52cf6"
SRC_URI[sha256sum] = "a086773121f09c8df7f67cda8295b147ce0a74a667aa27a15eadc6021db86ad2"

ROS_SPN = "ros_controllers"
S = "${WORKDIR}/ros_controllers-release-release-melodic-gripper_action_controller-0.14.3-0"

inherit catkin
