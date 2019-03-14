DESCRIPTION = "UUV Simulator's Gazebo plugins for simulation of hydrodynamic and hydrostatic forces, and underwater actuators (e. g. thrusters and fins)."
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "gazebo-dev protobuf-dev libeigen"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_gazebo_plugins/0.6.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "65953690f684a9ea652091ed9913375f"
SRC_URI[sha256sum] = "caad77b6bbdeaffc03bce6f6ec99e8064951060ef0081694001d291f08db9a4a"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_gazebo_plugins-0.6.10-0"

inherit catkin
