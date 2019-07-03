DESCRIPTION = "Controller to publish state of force-torque sensors"
AUTHOR = "Adolfo Rodriguez Tsouroukdissian"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "controller-interface geometry-msgs hardware-interface pluginlib realtime-tools roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/melodic/force_torque_sensor_controller/0.15.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1b09867ab2961066754800bab93e5019"
SRC_URI[sha256sum] = "5d2aede75983ca4789ab54a5b688500a58decd441e38582bc0d80999ee595786"

ROS_SPN = "ros_controllers"
S = "${WORKDIR}/ros_controllers-release-release-melodic-force_torque_sensor_controller-0.15.0-0"

inherit catkin
