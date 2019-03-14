DESCRIPTION = "The uuv_sensor_ros_plugins package"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "gazebo-dev gazebo-plugins sensor-msgs geometry-msgs std-msgs roscpp uuv-gazebo-plugins uuv-sensor-ros-plugins-msgs tf message-filters tf2-ros tf2"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_sensor_ros_plugins/0.6.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c9cf6d054b8f7ce16b8f9c368b6f4381"
SRC_URI[sha256sum] = "0d25b57ad18554d4a85c12a45612cd6a884f7e775fea8c90ed8d58ac2f0d0c36"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_sensor_ros_plugins-0.6.10-0"

inherit catkin
