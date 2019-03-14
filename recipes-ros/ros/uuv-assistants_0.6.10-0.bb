DESCRIPTION = "Tools and utilities to monitor and analyze the simulation"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "roscpp nav-msgs geometry-msgs sensor-msgs tf topic-tools"

RDEPENDS_${PN} = "rospy rostopic rosgraph gazebo-msgs visualization-msgs python-numpy"

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_assistants/0.6.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "22b12b6a60e28c873ced91ce4ab25664"
SRC_URI[sha256sum] = "a1fca8150c90ca1a8b4c3960e38ee39acfbb5d99b4689d8cc6dd1b29d6804c7d"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_assistants-0.6.10-0"

inherit catkin
