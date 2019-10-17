DESCRIPTION = "The uuv_gazebo package"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_gazebo/0.6.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0e1aadd757abbb0ed45a49e0651e8628"
SRC_URI[sha256sum] = "18f98a1d4bb9b97520dc86abd517810d51596f1c71d135ad4c8b7e157a24ad5c"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_gazebo-0.6.13-0"

inherit catkin
