DESCRIPTION = "The uuv_sensor_ros_plugins package"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "gazebo-dev gazebo-plugins sensor-msgs geometry-msgs std-msgs roscpp uuv-gazebo-plugins uuv-sensor-ros-plugins-msgs tf message-filters tf2-ros tf2 image-transport laser-geometry"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_sensor_ros_plugins/0.6.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "92cae1d57841e2f8678a472d51ff0ee3"
SRC_URI[sha256sum] = "ac3e8bcd2177cd655f0364adf30e48ebae2c10061e18ef905356a89943832684"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_sensor_ros_plugins-0.6.12-0"

inherit catkin
