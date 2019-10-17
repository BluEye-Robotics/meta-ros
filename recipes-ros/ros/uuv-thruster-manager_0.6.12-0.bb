DESCRIPTION = "The thruster manager package"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "message-generation std-msgs"

RDEPENDS_${PN} = "message-runtime tf rospy python-pyyaml uuv-gazebo-ros-plugins-msgs geometry-msgs"

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_thruster_manager/0.6.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f5af654ac885d05390412709a004dda2"
SRC_URI[sha256sum] = "0cb9fcbf17f25b9167c503546287ba202165dd048895f6cf7c3fb684541cccd2"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_thruster_manager-0.6.12-0"

inherit catkin
