DESCRIPTION = "Optimal allocation of forces and torques to thruster and fins of AUVs"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "message-generation geometry-msgs std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_auv_control_allocator/0.6.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "94c8e40d110c8b8dad748c676ec4059e"
SRC_URI[sha256sum] = "4705a119d5a1db5d0402ff3bea4d6ddc9fa00a3fda047484d4d58d03b4c06cef"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_auv_control_allocator-0.6.12-0"

inherit catkin
