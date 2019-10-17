DESCRIPTION = "Tools and utilities to monitor and analyze the simulation"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "roscpp nav-msgs geometry-msgs sensor-msgs tf topic-tools"

RDEPENDS_${PN} = "rospy rostopic rosgraph gazebo-msgs visualization-msgs python3-numpy"

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_assistants/0.6.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d0b730692b93f3a7ae045748a3931184"
SRC_URI[sha256sum] = "3f82b560d43b9d371d23bc2b9a6d8b1ea61b674d6578653c4b96df897f8e88f2"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_assistants-0.6.13-0"

inherit catkin
