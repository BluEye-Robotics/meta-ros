DESCRIPTION = "This package provides the Behavior Trees core library."
AUTHOR = "Michele Colledanchise"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "roslib libzmq3-dev roslib libzmq3-dev"

RDEPENDS_${PN} = "roslib libzmq3-dev"

SRC_URI = "https://github.com/BehaviorTree/behaviortree_cpp_v3-release/archive/release/melodic/behaviortree_cpp_v3/3.1.0-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7ef0aa74c7ec9d8d4bd462b9212f46d8"
SRC_URI[sha256sum] = "2c5f5784135cd3f4ff117b3b965ad455fc879f2e2be4a243662ac98917a3443e"

ROS_SPN = "behaviotree_cpp_v3"
S = "${WORKDIR}/behaviortree_cpp_v3-release-release-melodic-behaviortree_cpp_v3-3.1.0-2"

inherit catkin
