DESCRIPTION = "The thruster manager package"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "message-generation std-msgs"

RDEPENDS_${PN} = "message-runtime tf rospy python-pyyaml uuv-gazebo-ros-plugins-msgs geometry-msgs"

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_thruster_manager/0.6.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f137f850886dd44894b67de438ad8299"
SRC_URI[sha256sum] = "dd532c59413536c744721b16f10a97da19a7d88d721bf1954a495529438f2ad3"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_thruster_manager-0.6.10-0"

inherit catkin
