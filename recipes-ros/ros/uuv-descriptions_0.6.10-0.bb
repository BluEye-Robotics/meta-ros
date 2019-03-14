DESCRIPTION = "The uuv_descriptions package"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = ""

RDEPENDS_${PN} = "gazebo-ros gazebo-ros-control uuv-sensor-ros-plugins uuv-gazebo-ros-plugins robot-state-publisher uuv-assistants"

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_descriptions/0.6.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f4bf2233a8c965ab604c8754dcfe8da8"
SRC_URI[sha256sum] = "6966a2c2e02f32e5b5ed75c845a8e6789f5e0775070a1cdf773e7d245ded2db6"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_descriptions-0.6.10-0"

inherit catkin
