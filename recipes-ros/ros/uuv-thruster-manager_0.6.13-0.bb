DESCRIPTION = "The thruster manager package"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "message-generation std-msgs"

RDEPENDS_${PN} = "message-runtime tf rospy python-pyyaml uuv-gazebo-ros-plugins-msgs geometry-msgs uuv-assistants"

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_thruster_manager/0.6.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a545bf564216cf589258d7b69bd7a1bb"
SRC_URI[sha256sum] = "1ab65fc013e0365a7d680c40c82f7ed9a1d1ab91514376795bf5160f80f0cdea"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_thruster_manager-0.6.13-0"

inherit catkin
