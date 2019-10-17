DESCRIPTION = "ROS packages for the Turtlebot3 (meta package)"
AUTHOR = "Pyo"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "turtlebot3-bringup turtlebot3-description turtlebot3-example turtlebot3-navigation turtlebot3-slam turtlebot3-teleop"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3-release/archive/release/melodic/turtlebot3/1.2.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "098661c8d485f4a6f0fa3f564855eea7"
SRC_URI[sha256sum] = "23abc6a162dc77a97d154c591285f8c235c2afe0c2906185a91ccec0a80a2b1c"

S = "${WORKDIR}/turtlebot3-release-release-melodic-turtlebot3-1.2.0-0"

inherit catkin
