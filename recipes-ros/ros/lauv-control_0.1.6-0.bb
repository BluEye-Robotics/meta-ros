DESCRIPTION = "Collection of configuration and launch files to start controllers for the LAUV."
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = ""

RDEPENDS_${PN} = "uuv-teleop uuv-control-utils uuv-trajectory-control uuv-auv-control-allocator lauv-description"

SRC_URI = "https://github.com/uuvsimulator/lauv_gazebo-release/archive/release/melodic/lauv_control/0.1.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bf3b3c72b9765de3ea272545a2bc7ba8"
SRC_URI[sha256sum] = "2a5dafaa1dbc26fc3c4d0b91fc39a6a9f822b8ed8c164e5001189c881cac011d"

ROS_SPN = "lauv_gazebo"
S = "${WORKDIR}/lauv_gazebo-release-release-melodic-lauv_control-0.1.6-0"

inherit catkin
