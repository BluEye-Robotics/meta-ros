DESCRIPTION = "Controller to publish state of force-torque sensors"
AUTHOR = "Adolfo Rodriguez Tsouroukdissian"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "controller-interface geometry-msgs hardware-interface pluginlib realtime-tools roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/melodic/force_torque_sensor_controller/0.14.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e6ca1ce3fff35a9798c167bf3b5fe067"
SRC_URI[sha256sum] = "a481081870f7413a489ab1558b68c25b85ec9d2d241d350abd223f7a3b07f1e7"

ROS_SPN = "ros_controllers"
S = "${WORKDIR}/ros_controllers-release-release-melodic-force_torque_sensor_controller-0.14.3-0"

inherit catkin
