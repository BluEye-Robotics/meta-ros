DESCRIPTION = "Library of ros controllers"
AUTHOR = "Wim Meeussen"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "ackermann-steering-controller diff-drive-controller effort-controllers force-torque-sensor-controller forward-command-controller gripper-action-controller imu-sensor-controller joint-state-controller joint-trajectory-controller position-controllers rqt-joint-trajectory-controller velocity-controllers"

SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/melodic/ros_controllers/0.14.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8c6303f39e44c39f7a7ae8a9e1bd536b"
SRC_URI[sha256sum] = "e0790501bd5f7425160db3a88f8a7fef02fcaf46819c899f3cabb465f323f15f"

S = "${WORKDIR}/ros_controllers-release-release-melodic-ros_controllers-0.14.3-0"

inherit catkin
