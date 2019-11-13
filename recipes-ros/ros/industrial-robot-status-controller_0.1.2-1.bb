DESCRIPTION = "A ros_control controller that reports robot status using the ROS-Industrial RobotStatus message."
AUTHOR = "G.A. vd. Hoorn (TU Delft Robotics Institute)"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "industrial-robot-status-interface controller-interface hardware-interface industrial-msgs pluginlib realtime-tools"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/gavanderhoorn/industrial_robot_status_controller-release/archive/release/melodic/industrial_robot_status_controller/0.1.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "46233582724d28ead6862a3a8f0e8773"
SRC_URI[sha256sum] = "89e803b0db1051773ed0cd7c0e8287ed8f1ab406caa7d637479742686311e3a5"

S = "${WORKDIR}/industrial_robot_status_controller-release-release-melodic-industrial_robot_status_controller-0.1.2-1"

inherit catkin
