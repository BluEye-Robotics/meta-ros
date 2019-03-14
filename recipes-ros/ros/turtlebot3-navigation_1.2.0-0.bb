DESCRIPTION = "The turtlebot3_navigation provides roslaunch scripts for starting the navigation."
AUTHOR = "Pyo"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "amcl map-server move-base turtlebot3-bringup"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3-release/archive/release/melodic/turtlebot3_navigation/1.2.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ba9bdd93b338373db447f649c631db17"
SRC_URI[sha256sum] = "9599bcd399b7a62899e234f85e9ab1394646211531486ae7510d040b3fd6c890"

ROS_SPN = "turtlebot3"
S = "${WORKDIR}/turtlebot3-release-release-melodic-turtlebot3_navigation-1.2.0-0"

inherit catkin
