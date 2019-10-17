DESCRIPTION = "This package allows to use the Robot One Framework with ROS. The supported features of the framework includes the simulator and connection with the physical robots"
AUTHOR = "Alexander S. Barbosa"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "roscpp std-msgs geometry-msgs sensor-msgs tf message-generation roscpp std-msgs geometry-msgs sensor-msgs tf"

RDEPENDS_${PN} = "roscpp std-msgs geometry-msgs sensor-msgs tf message-runtime"

SRC_URI = "https://github.com/AlexanderSilvaB/robot-one-ros-release/archive/release/melodic/robot_one/0.1.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "281d99d3978139e579d7daee113ed758"
SRC_URI[sha256sum] = "8577070c2981b950d02c6e8353edea64dc1724952a8981d82d980a7de21109d4"

S = "${WORKDIR}/robot-one-ros-release-release-melodic-robot_one-0.1.1-1"

inherit catkin
