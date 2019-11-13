DESCRIPTION = "Exposes ROS-Industrial's RobotStatus info from hardware_interfaces for consumption by ros_control controllers."
AUTHOR = "G.A. vd. Hoorn (TU Delft Robotics Institute)"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "hardware-interface"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/gavanderhoorn/industrial_robot_status_controller-release/archive/release/melodic/industrial_robot_status_interface/0.1.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a8d4a8509760c313bc638f202601aebb"
SRC_URI[sha256sum] = "27b082bec56d4f649c198ac39b78b9d2932b448f4ab7281ff055f023d4085be8"

ROS_SPN = "industrial_robot_status_controller"
S = "${WORKDIR}/industrial_robot_status_controller-release-release-melodic-industrial_robot_status_interface-0.1.2-1"

inherit catkin
