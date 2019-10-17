DESCRIPTION = "Optimal allocation of forces and torques to thruster and fins of AUVs"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "message-generation geometry-msgs std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_auv_control_allocator/0.6.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "12e20dd6bb97dfca3e5bc0bb05b8b87b"
SRC_URI[sha256sum] = "4db21178544a59cd19888ae887ff0bd17b75737fd0972673c4314a6db1cf3482"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_auv_control_allocator-0.6.13-0"

inherit catkin
