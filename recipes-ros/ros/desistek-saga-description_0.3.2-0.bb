DESCRIPTION = "The robot description files for the Desistek SAGA ROV underwater vehicle"
AUTHOR = "Emre Ege"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = ""

RDEPENDS_${PN} = "uuv-descriptions uuv-gazebo-ros-plugins uuv-sensor-ros-plugins gazebo-ros uuv-assistants robot-state-publisher"

SRC_URI = "https://github.com/uuvsimulator/desistek_saga-release/archive/release/melodic/desistek_saga_description/0.3.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9d13ac739ffbe638e309ce7ece4948e1"
SRC_URI[sha256sum] = "1d23906087b0f5b4119ca5b63d3d621a40f93709a58a61fdab09330e3f712126"

ROS_SPN = "desistek_saga"
S = "${WORKDIR}/desistek_saga-release-release-melodic-desistek_saga_description-0.3.2-0"

inherit catkin
