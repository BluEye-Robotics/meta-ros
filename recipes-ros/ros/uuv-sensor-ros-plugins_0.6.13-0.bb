DESCRIPTION = "The uuv_sensor_ros_plugins package"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "gazebo-dev gazebo-plugins sensor-msgs geometry-msgs std-msgs roscpp uuv-gazebo-plugins uuv-sensor-ros-plugins-msgs tf message-filters tf2-ros tf2 image-transport laser-geometry"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_sensor_ros_plugins/0.6.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "11cf554912133471de637f28acb5979a"
SRC_URI[sha256sum] = "403319ab9a425f0ace52c7ca845a359b67d5a0ea1fb8737a172608d9f41e4eb0"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_sensor_ros_plugins-0.6.13-0"

inherit catkin
