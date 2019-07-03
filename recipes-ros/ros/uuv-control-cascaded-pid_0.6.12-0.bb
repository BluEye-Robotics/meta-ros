DESCRIPTION = "A cascade of PID controllers for acceleration, velocity, and position control."
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "dynamic-reconfigure"

RDEPENDS_${PN} = "geometry-msgs nav-msgs tf rospy python-numpy"

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_control_cascaded_pid/0.6.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ec8e46aa55f640ea75d171b3ce5986b5"
SRC_URI[sha256sum] = "7d7e8b5a6059846d47eb603f5381eb0f95ca102bd69bceb468c9e426ce4a8ccc"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_control_cascaded_pid-0.6.12-0"

inherit catkin
