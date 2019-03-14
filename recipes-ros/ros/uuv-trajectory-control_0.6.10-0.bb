DESCRIPTION = "The uuv_trajectory_control package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = ""

RDEPENDS_${PN} = "rospy roslib python-numpy python-matplotlib python-pyyaml python-scipy geometry-msgs uuv-control-msgs tf std-msgs nav-msgs visualization-msgs"

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_trajectory_control/0.6.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "de08aa8ea621c6d1de55e4ce33b3a647"
SRC_URI[sha256sum] = "392957a1863c5095f5fcb8b61ecac3520e2a8fa4e8e21175ac691288882bbf63"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_trajectory_control-0.6.10-0"

inherit catkin
