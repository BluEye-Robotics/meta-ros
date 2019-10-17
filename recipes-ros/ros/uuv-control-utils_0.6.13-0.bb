DESCRIPTION = "The uuv_control_utils package"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = ""

RDEPENDS_${PN} = "rospy gazebo-msgs geometry-msgs uuv-world-ros-plugins-msgs uuv-gazebo-ros-plugins-msgs python3-numpy uuv-control-msgs std-msgs python3-pyyaml visualization-msgs nav-msgs uuv-trajectory-control"

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_control_utils/0.6.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4e214c03d61fb966be88bf5b65896ee5"
SRC_URI[sha256sum] = "7b4acaefcbd1899b5a4d5c3b9e4a24617317b65a86ca79322bdf871fadf69e74"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_control_utils-0.6.13-0"

inherit catkin
