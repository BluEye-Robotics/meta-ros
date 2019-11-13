DESCRIPTION = "The uuv_sensor_ros_plugins_msgs package"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "geometry-msgs message-generation geometry-msgs"

RDEPENDS_${PN} = "geometry-msgs message-runtime"

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_sensor_ros_plugins_msgs/0.6.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "326aa2ac72a3f13e1b2a643127cb625c"
SRC_URI[sha256sum] = "224d60b31ea5e63efae3ca2fc78b501d208c77a873751a45a64475a3ae4cafd7"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_sensor_ros_plugins_msgs-0.6.13-0"

inherit catkin
