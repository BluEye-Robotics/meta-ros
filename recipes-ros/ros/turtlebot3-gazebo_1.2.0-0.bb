DESCRIPTION = "Gazebo simulation package for the TurtleBot3"
AUTHOR = "Pyo"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roscpp std-msgs sensor-msgs geometry-msgs nav-msgs tf gazebo-ros"

RDEPENDS_${PN} = "gazebo"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3_simulations-release/archive/release/melodic/turtlebot3_gazebo/1.2.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bd566892ac218c6660559ff4c91e9711"
SRC_URI[sha256sum] = "9c82b64f9c29a023ddaf9388d987b60a7584a62400a9ca9d4421347ca4750651"

ROS_SPN = "turtlebot3_simulations"
S = "${WORKDIR}/turtlebot3_simulations-release-release-melodic-turtlebot3_gazebo-1.2.0-0"

inherit catkin
