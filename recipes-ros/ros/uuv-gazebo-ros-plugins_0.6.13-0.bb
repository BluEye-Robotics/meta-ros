DESCRIPTION = "UUV Simulator's extended ROS plugins for generation of the necessary ROS services and topics during the simulation."
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "uuv-gazebo-plugins uuv-gazebo-ros-plugins-msgs sensor-msgs geometry-msgs std-msgs roscpp visualization-msgs tf2-ros tf2 gazebo-dev"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_gazebo_ros_plugins/0.6.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a28c2c8a9780567d1e5e980d679c9c28"
SRC_URI[sha256sum] = "061cc787ee014cb7729eed0a28bdbb52967c821a3fb8bd7ead255b38909a2a3e"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_gazebo_ros_plugins-0.6.13-0"

inherit catkin
