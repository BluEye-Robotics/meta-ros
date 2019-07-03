DESCRIPTION = "Robot description for the ECA A9 AUV"
AUTHOR = "Thibault Pelletier"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = ""

RDEPENDS_${PN} = "uuv-descriptions uuv-gazebo-ros-plugins uuv-sensor-ros-plugins gazebo-ros uuv-assistants robot-state-publisher"

SRC_URI = "https://github.com/uuvsimulator/eca_a9-release/archive/release/melodic/eca_a9_description/0.1.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8dfc4232886fb78168c045595d59747d"
SRC_URI[sha256sum] = "755c4708260a898bf6311271a70f9f48379327eb3c5721727afba6dc94fb035f"

ROS_SPN = "eca_a9"
S = "${WORKDIR}/eca_a9-release-release-melodic-eca_a9_description-0.1.6-0"

inherit catkin
