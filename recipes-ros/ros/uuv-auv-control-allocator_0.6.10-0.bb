DESCRIPTION = "Optimal allocation of forces and torques to thruster and fins of AUVs"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "message-generation geometry-msgs std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_auv_control_allocator/0.6.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f076f5aa2a038f5564565c772ace81ec"
SRC_URI[sha256sum] = "d1b447de181bf53594006e902a67f5c26a674da656123cfedf6da344a6ca2711"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_auv_control_allocator-0.6.10-0"

inherit catkin
