DESCRIPTION = "The uuv_gazebo_worlds package"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "gazebo-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_gazebo_worlds/0.6.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f07b8c6422ed20b2a877ed2573b6f25d"
SRC_URI[sha256sum] = "10b68d74ce5c2ceb1abc57e18c55bd18d1558467b45007cd9709f08b85b15ad3"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_gazebo_worlds-0.6.10-0"

inherit catkin
