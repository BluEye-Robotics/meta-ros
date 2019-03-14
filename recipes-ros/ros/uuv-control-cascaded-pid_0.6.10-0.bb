DESCRIPTION = "A cascade of PID controllers for acceleration, velocity, and position control."
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "dynamic-reconfigure"

RDEPENDS_${PN} = "geometry-msgs nav-msgs tf rospy python-numpy"

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_control_cascaded_pid/0.6.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "61dff25c234e27f47f53f3f8f4c74915"
SRC_URI[sha256sum] = "3d75578e17e9f0a19fdffea6ba51a69e0d066fdc8fae96cf88672466e69bdd21"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_control_cascaded_pid-0.6.10-0"

inherit catkin
