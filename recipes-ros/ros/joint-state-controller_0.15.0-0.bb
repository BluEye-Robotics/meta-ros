DESCRIPTION = "Controller to publish joint state"
AUTHOR = "Wim Meeussen"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "controller-interface hardware-interface pluginlib sensor-msgs realtime-tools roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/melodic/joint_state_controller/0.15.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "78f484e14b65317b0f39796a31fbac55"
SRC_URI[sha256sum] = "97c1c877b5f1f3fd9377c0c1e8a8fb5ef9b2ab05957d3469d25300bb088e937e"

ROS_SPN = "ros_controllers"
S = "${WORKDIR}/ros_controllers-release-release-melodic-joint_state_controller-0.15.0-0"

inherit catkin
