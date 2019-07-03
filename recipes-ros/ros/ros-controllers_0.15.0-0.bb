DESCRIPTION = "Library of ros controllers"
AUTHOR = "Wim Meeussen"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "ackermann-steering-controller diff-drive-controller effort-controllers force-torque-sensor-controller forward-command-controller gripper-action-controller imu-sensor-controller joint-state-controller joint-trajectory-controller position-controllers rqt-joint-trajectory-controller velocity-controllers"

SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/melodic/ros_controllers/0.15.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3268f0d249bb88d1ac92a28f4b84a995"
SRC_URI[sha256sum] = "829aba95b33c273faf7fe6e06f26abc2660fe9bb61e784751da72646c8fd0c06"

S = "${WORKDIR}/ros_controllers-release-release-melodic-ros_controllers-0.15.0-0"

inherit catkin
