DESCRIPTION = "UUV Simulator's Gazebo plugins for simulation of hydrodynamic and hydrostatic forces, and underwater actuators (e. g. thrusters and fins)."
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "gazebo-dev protobuf-dev libeigen"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_gazebo_plugins/0.6.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "25ad553febf7d6f4d3f754623619c66f"
SRC_URI[sha256sum] = "ba78a31401069832ef24a64776753b3e510db70e7c95761f2556f8ac3e9b6d93"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_gazebo_plugins-0.6.13-0"

inherit catkin
