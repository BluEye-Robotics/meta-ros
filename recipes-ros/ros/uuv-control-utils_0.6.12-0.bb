DESCRIPTION = "The uuv_control_utils package"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = ""

RDEPENDS_${PN} = "rospy gazebo-msgs geometry-msgs uuv-world-ros-plugins-msgs uuv-gazebo-ros-plugins-msgs python-numpy uuv-control-msgs std-msgs python-pyyaml visualization-msgs nav-msgs uuv-trajectory-control"

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_control_utils/0.6.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5fc497062755c7ce57a792bd4d12d8ed"
SRC_URI[sha256sum] = "7b94bb38474f23a0eac90c29b0ac17eb6417c14a7b13cd0da2f4dba735b6663a"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_control_utils-0.6.12-0"

inherit catkin
