DESCRIPTION = "The gripper_action_controller package"
AUTHOR = "Sachin Chitta"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib angles cmake-modules control-msgs control-toolbox controller-interface controller-manager hardware-interface realtime-tools roscpp trajectory-msgs urdf xacro"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/melodic/gripper_action_controller/0.15.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fefbb7c5341fd9e06b49005e480d140a"
SRC_URI[sha256sum] = "7b15202e7175d3352a3855ee222ddbd4db8a5221425436f4637a80e600907ce2"

ROS_SPN = "ros_controllers"
S = "${WORKDIR}/ros_controllers-release-release-melodic-gripper_action_controller-0.15.0-0"

inherit catkin
