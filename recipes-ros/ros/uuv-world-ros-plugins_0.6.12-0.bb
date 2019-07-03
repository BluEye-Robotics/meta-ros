DESCRIPTION = "The uuv_world_ros_plugins package"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "gazebo-msgs roscpp uuv-world-plugins geometry-msgs uuv-world-ros-plugins-msgs gazebo-dev"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_world_ros_plugins/0.6.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b597fcecf48df7e85fe8ab6b635ba748"
SRC_URI[sha256sum] = "00bd2da4fadb805c2ccd6a7baaa3af5c60d7c04075780eb5365f24b4ebc083de"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_world_ros_plugins-0.6.12-0"

inherit catkin
