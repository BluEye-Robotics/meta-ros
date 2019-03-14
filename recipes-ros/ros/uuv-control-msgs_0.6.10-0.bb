DESCRIPTION = "The uuv_control_msgs package"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "std-msgs geometry-msgs message-generation"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_control_msgs/0.6.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2aaba7a0525dbf984f2583a789c60369"
SRC_URI[sha256sum] = "0bfc715f1deec3262205d5c82aa99a9c10054d0d2f6e3467aaff63b7d60c9789"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_control_msgs-0.6.10-0"

inherit catkin
