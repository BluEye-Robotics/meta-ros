DESCRIPTION = "Controller to publish state of IMU sensors"
AUTHOR = "Adolfo Rodriguez Tsouroukdissian"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "realtime-tools roscpp hardware-interface pluginlib controller-interface sensor-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/melodic/imu_sensor_controller/0.15.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8c7c08506093b5d7580b87e44b9455b7"
SRC_URI[sha256sum] = "9e5a18ddf716a8a9edd539104025b9d6828acb17b690b660780b56f05c2f0948"

ROS_SPN = "ros_controllers"
S = "${WORKDIR}/ros_controllers-release-release-melodic-imu_sensor_controller-0.15.0-0"

inherit catkin
