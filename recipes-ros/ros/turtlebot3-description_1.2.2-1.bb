DESCRIPTION = "3D models of the TurtleBot3 for simulation and visualization"
AUTHOR = "Pyo"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "urdf xacro"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3-release/archive/release/melodic/turtlebot3_description/1.2.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "60d1ddfa26ab19b50d2919cad1fec720"
SRC_URI[sha256sum] = "c0b22d01ac98d63f27f51f7ce6c9ea134ca186b48d8c08e2c71ca984b0791a32"

ROS_SPN = "turtlebot3"
S = "${WORKDIR}/turtlebot3-release-release-melodic-turtlebot3_description-1.2.2-1"

inherit catkin
