DESCRIPTION = "Robot description files for the LAUV."
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = ""

RDEPENDS_${PN} = "uuv-descriptions uuv-gazebo-ros-plugins uuv-sensor-ros-plugins gazebo-ros uuv-assistants robot-state-publisher xacro"

SRC_URI = "https://github.com/uuvsimulator/lauv_gazebo-release/archive/release/melodic/lauv_description/0.1.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c7919e7673ac7e51c5fbb7ddc6a7cf6b"
SRC_URI[sha256sum] = "a3cd50cb68d4034daf6aa283fee53329c9e70c3177c0fe1bfdd169a236e4ab5c"

ROS_SPN = "lauv_gazebo"
S = "${WORKDIR}/lauv_gazebo-release-release-melodic-lauv_description-0.1.6-0"

inherit catkin
