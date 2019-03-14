DESCRIPTION = "The uuv_world_ros_plugins package"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "gazebo-msgs roscpp uuv-world-plugins geometry-msgs uuv-world-ros-plugins-msgs gazebo-dev"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_world_ros_plugins/0.6.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "20404ae1a4580eb6ffe50d14af6d2d52"
SRC_URI[sha256sum] = "0bb8f7fb759854a6cbea931882f28f926a74eded1d59addbb24ffa388ca95ef5"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_world_ros_plugins-0.6.10-0"

inherit catkin
