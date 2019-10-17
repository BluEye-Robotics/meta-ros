DESCRIPTION = "The uuv_gazebo_worlds package"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "gazebo-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_gazebo_worlds/0.6.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e16708f7f331b611b8635b400f626a5c"
SRC_URI[sha256sum] = "c1b93c1bb6574a54a18765928e6d640b4484fb3cd982698ff97936083af57166"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_gazebo_worlds-0.6.13-0"

inherit catkin
