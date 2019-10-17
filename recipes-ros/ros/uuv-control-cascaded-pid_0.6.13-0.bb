DESCRIPTION = "A cascade of PID controllers for acceleration, velocity, and position control."
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "dynamic-reconfigure"

RDEPENDS_${PN} = "geometry-msgs nav-msgs tf rospy python-numpy"

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_control_cascaded_pid/0.6.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "11d16a6bfb52cd7aee3cf57a21d1d152"
SRC_URI[sha256sum] = "dbf283b84f3ab21206873ec6a4423873ae696cd5e00d9ced11568cef4d0930be"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_control_cascaded_pid-0.6.13-0"

inherit catkin
