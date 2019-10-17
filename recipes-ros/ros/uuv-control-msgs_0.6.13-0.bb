DESCRIPTION = "The uuv_control_msgs package"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "std-msgs geometry-msgs message-generation"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_control_msgs/0.6.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bee68693f6edf401d6a84318a5f1a139"
SRC_URI[sha256sum] = "eb58f7a2416af641a4668c72ee16804e77f3a84e4e3250c701e6395fa97a2e47"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_control_msgs-0.6.13-0"

inherit catkin
