DESCRIPTION = "The uuv_trajectory_control package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = ""

RDEPENDS_${PN} = "rospy roslib python-numpy python-matplotlib python-pyyaml python-scipy geometry-msgs uuv-control-msgs tf std-msgs nav-msgs visualization-msgs"

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_trajectory_control/0.6.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d8ac81269ea7e69e09fcce77ed1636d0"
SRC_URI[sha256sum] = "d33638aee52e6fa72addac2f19345dd79240e8726555426b7ed55a722fd3d5ef"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_trajectory_control-0.6.12-0"

inherit catkin
