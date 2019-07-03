DESCRIPTION = "The uuv_descriptions package"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = ""

RDEPENDS_${PN} = "gazebo-ros gazebo-ros-control uuv-sensor-ros-plugins uuv-gazebo-ros-plugins robot-state-publisher uuv-assistants xacro"

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_descriptions/0.6.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "789c5a6b3fcce1146b3edbb877f7f072"
SRC_URI[sha256sum] = "315d7cb17b30b6a4de0a6e2c88cb431df0cc9e97f6100b6bd061f78cfac28796"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_descriptions-0.6.12-0"

inherit catkin
