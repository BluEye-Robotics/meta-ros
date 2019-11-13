DESCRIPTION = "The turtlebot3_navigation provides roslaunch scripts for starting the navigation."
AUTHOR = "Pyo"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "amcl map-server move-base turtlebot3-bringup"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3-release/archive/release/melodic/turtlebot3_navigation/1.2.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "df905349f067dbe987bfec23da91dd20"
SRC_URI[sha256sum] = "f2e7db807baf99bf7fc327d56fecaf1f6ba3695f2e9319d838b4912792b96896"

ROS_SPN = "turtlebot3"
S = "${WORKDIR}/turtlebot3-release-release-melodic-turtlebot3_navigation-1.2.2-1"

inherit catkin
