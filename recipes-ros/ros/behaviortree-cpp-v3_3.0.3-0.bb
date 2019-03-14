DESCRIPTION = "This package provides the Behavior Trees core library."
AUTHOR = "Michele Colledanchise"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "roslib libzmq3-dev libdw-dev roslib libzmq3-dev libdw-dev"

RDEPENDS_${PN} = "roslib libzmq3-dev libdw-dev"

SRC_URI = "https://github.com/BehaviorTree/behaviortree_cpp_v3-release/archive/release/melodic/behaviortree_cpp_v3/3.0.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d51d879ecfa8515083901276f04e0743"
SRC_URI[sha256sum] = "2c71c89fa2696192dc90f689c424f9bb7dc4f436599fe615824963e72052e272"

ROS_SPN = "behaviotree_cpp_v3"
S = "${WORKDIR}/behaviortree_cpp_v3-release-release-melodic-behaviortree_cpp_v3-3.0.3-0"

inherit catkin
