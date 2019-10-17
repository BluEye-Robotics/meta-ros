DESCRIPTION = "The uuv_world_ros_plugins package"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "gazebo-msgs roscpp uuv-world-plugins geometry-msgs uuv-world-ros-plugins-msgs gazebo-dev"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_world_ros_plugins/0.6.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "085f4a74f9d0569bb7c3271e44c61bd5"
SRC_URI[sha256sum] = "446876d4136616bf7c1762824b5d849a7275d4364ad2b56c8f249cb293de248a"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_world_ros_plugins-0.6.13-0"

inherit catkin
