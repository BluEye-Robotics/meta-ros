DESCRIPTION = "3D models of the TurtleBot3 for simulation and visualization"
AUTHOR = "Pyo"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "urdf xacro"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3-release/archive/release/melodic/turtlebot3_description/1.2.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cd031499b8d056a527d9e30f4a1f28c3"
SRC_URI[sha256sum] = "1a16e0a23bc531a33c583cc6c3a34fed5903a831334ce8bb71e778c912406969"

ROS_SPN = "turtlebot3"
S = "${WORKDIR}/turtlebot3-release-release-melodic-turtlebot3_description-1.2.0-0"

inherit catkin
