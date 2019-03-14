DESCRIPTION = "Package for TurtleBot3 fake node. With this package, simple tests can be done without a robot. You can do simple tests using this package on rviz without real robots."
AUTHOR = "Pyo"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roscpp std-msgs sensor-msgs geometry-msgs nav-msgs tf turtlebot3-msgs"

RDEPENDS_${PN} = "robot-state-publisher"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3_simulations-release/archive/release/melodic/turtlebot3_fake/1.2.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4e77ff6db071e5115db7c068488ff188"
SRC_URI[sha256sum] = "5e76727354184cc0f97b0cf61d4c3743301e431c5d46bbd87436fbed8f1e2e95"

ROS_SPN = "turtlebot3_simulations"
S = "${WORKDIR}/turtlebot3_simulations-release-release-melodic-turtlebot3_fake-1.2.0-0"

inherit catkin
