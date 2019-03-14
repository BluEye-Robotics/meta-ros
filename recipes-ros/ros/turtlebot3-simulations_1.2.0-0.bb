DESCRIPTION = "ROS packages for the turtlebot3 simulation (meta package)"
AUTHOR = "Pyo"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "turtlebot3-fake turtlebot3-gazebo"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3_simulations-release/archive/release/melodic/turtlebot3_simulations/1.2.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "04f77195fdea99fcce50c8282e20cea2"
SRC_URI[sha256sum] = "a413fe6412ba3e36a36f1cec6072ff4304dc37730d14709564bb5f8f26134005"

S = "${WORKDIR}/turtlebot3_simulations-release-release-melodic-turtlebot3_simulations-1.2.0-0"

inherit catkin
