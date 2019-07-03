DESCRIPTION = "Tools and utilities to monitor and analyze the simulation"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "roscpp nav-msgs geometry-msgs sensor-msgs tf topic-tools"

RDEPENDS_${PN} = "rospy rostopic rosgraph gazebo-msgs visualization-msgs python-numpy"

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_assistants/0.6.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6eaa0aafaeaddb3b6fe081d609d99548"
SRC_URI[sha256sum] = "b952f75576e52624e197af9d45457c3eb6e29794a6ed47903c34bfab1644839b"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_assistants-0.6.12-0"

inherit catkin
