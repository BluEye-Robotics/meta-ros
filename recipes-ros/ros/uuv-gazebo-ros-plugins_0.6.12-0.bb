DESCRIPTION = "UUV Simulator's extended ROS plugins for generation of the necessary ROS services and topics during the simulation."
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "uuv-gazebo-plugins uuv-gazebo-ros-plugins-msgs sensor-msgs geometry-msgs std-msgs roscpp visualization-msgs tf2-ros tf2 gazebo-dev"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_gazebo_ros_plugins/0.6.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9393d929e0b11ba2771ac4f91beea5e9"
SRC_URI[sha256sum] = "235687962d1fc3b7c39270a8ac8ff82e9046db6e7d8f064997f380f80faf7a4e"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_gazebo_ros_plugins-0.6.12-0"

inherit catkin
