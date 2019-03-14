DESCRIPTION = "The uuv_sensor_ros_plugins_msgs package"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "geometry-msgs message-generation geometry-msgs"

RDEPENDS_${PN} = "geometry-msgs message-runtime"

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_sensor_ros_plugins_msgs/0.6.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5592c6a95cbd006d07090b3ee38351b5"
SRC_URI[sha256sum] = "11a61e9c1cb05c12af6ecfb2bbb21b0f8d5eea0096eef9299d0eca8f0132b806"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_sensor_ros_plugins_msgs-0.6.10-0"

inherit catkin
