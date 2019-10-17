DESCRIPTION = "The uuv_sensor_ros_plugins_msgs package"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "geometry-msgs message-generation geometry-msgs"

RDEPENDS_${PN} = "geometry-msgs message-runtime"

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_sensor_ros_plugins_msgs/0.6.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b79c10738a07b91f6a568f9a293ff1db"
SRC_URI[sha256sum] = "67d8e8696d7f63e743d95e1f4d2df3f619f6ab8cf679de3a13e105e21da59470"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_sensor_ros_plugins_msgs-0.6.12-0"

inherit catkin
