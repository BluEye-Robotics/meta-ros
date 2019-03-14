DESCRIPTION = "The uuv_control_utils package"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = ""

RDEPENDS_${PN} = "rospy gazebo-msgs geometry-msgs uuv-world-ros-plugins-msgs uuv-gazebo-ros-plugins-msgs python-numpy uuv-control-msgs std-msgs python-pyyaml visualization-msgs nav-msgs uuv-trajectory-control"

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_control_utils/0.6.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1a5a3f64caf4f11bce1e7c7dd84f25ff"
SRC_URI[sha256sum] = "c2cd071c9d224113db678734c97021269285000c8ff1862a59ffa84b8197eb1e"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_control_utils-0.6.10-0"

inherit catkin
