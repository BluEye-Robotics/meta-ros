DESCRIPTION = "Controller to publish state of IMU sensors"
AUTHOR = "Adolfo Rodriguez Tsouroukdissian"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "realtime-tools roscpp hardware-interface pluginlib controller-interface sensor-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/melodic/imu_sensor_controller/0.14.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ff0bb50b2b9b89c1d0726682f1afb744"
SRC_URI[sha256sum] = "fefbde2b6b83a43efe572c8ef3b2b7bb5b306daa6e74c2e23bad4c05a96c5ad4"

ROS_SPN = "ros_controllers"
S = "${WORKDIR}/ros_controllers-release-release-melodic-imu_sensor_controller-0.14.3-0"

inherit catkin
