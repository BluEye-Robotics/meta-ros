DESCRIPTION = "UUV Simulator's Gazebo plugins for simulation of hydrodynamic and hydrostatic forces, and underwater actuators (e. g. thrusters and fins)."
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "gazebo-dev protobuf-dev libeigen"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_gazebo_plugins/0.6.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "dd7b4b6b2d35aae73b0cab3b18577e1a"
SRC_URI[sha256sum] = "348592fab624487d3da07bcd4ecdedb3e24ce8cab570b071b37d886e5a3bae3a"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_gazebo_plugins-0.6.12-0"

inherit catkin
