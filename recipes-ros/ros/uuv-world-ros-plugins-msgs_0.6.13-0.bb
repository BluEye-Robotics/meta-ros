DESCRIPTION = "The uuv_world_ros_plugins_msgs package"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "message-generation std-msgs geometry-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_world_ros_plugins_msgs/0.6.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f703e521136893d9cf1e715e99d5783a"
SRC_URI[sha256sum] = "ba13fec3c313d07c75b858d904461d4edbec745a2f8ceed0d3e7142c6edd8184"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_world_ros_plugins_msgs-0.6.13-0"

inherit catkin
