DESCRIPTION = "The uuv_world_plugins package"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "gazebo-dev gazebo-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_world_plugins/0.6.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9109458d518382637043c6313d491adf"
SRC_URI[sha256sum] = "11734081b68d909b9061a8569ba8a9d480dfc05785c1fe34fdfe4ad118c1adbc"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_world_plugins-0.6.10-0"

inherit catkin
