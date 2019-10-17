DESCRIPTION = "The uuv_descriptions package"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = ""

RDEPENDS_${PN} = "gazebo-ros gazebo-ros-control uuv-sensor-ros-plugins uuv-gazebo-ros-plugins robot-state-publisher uuv-assistants xacro"

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_descriptions/0.6.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "aa674e528da8571d091d6283e74ba0e2"
SRC_URI[sha256sum] = "b502f0791f2a6185ec41cd24b0a7bc29d2edb5c219ba6e21e6112017e071eff1"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_descriptions-0.6.13-0"

inherit catkin
