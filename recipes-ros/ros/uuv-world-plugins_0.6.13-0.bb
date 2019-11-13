DESCRIPTION = "The uuv_world_plugins package"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "gazebo-dev gazebo-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_world_plugins/0.6.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1feaa175b846db1a811e27bbb6c72b13"
SRC_URI[sha256sum] = "b36f8971609bacb0040109f63d8df1d70c130a4056ed8d0f3084b6deaf8f5ad1"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_world_plugins-0.6.13-0"

inherit catkin
