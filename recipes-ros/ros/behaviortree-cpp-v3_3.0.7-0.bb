DESCRIPTION = "This package provides the Behavior Trees core library."
AUTHOR = "Michele Colledanchise"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "roslib libzmq3-dev libdw-dev roslib libzmq3-dev libdw-dev"

RDEPENDS_${PN} = "roslib libzmq3-dev libdw-dev"

SRC_URI = "https://github.com/BehaviorTree/behaviortree_cpp_v3-release/archive/release/melodic/behaviortree_cpp_v3/3.0.7-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d87c7dc6746f5f63e550c6ef91fdf062"
SRC_URI[sha256sum] = "fefe63e715f3e2c0e6b1a9a3b57848639f70576986a4f24d7b88a5d8e838b257"

ROS_SPN = "behaviotree_cpp_v3"
S = "${WORKDIR}/behaviortree_cpp_v3-release-release-melodic-behaviortree_cpp_v3-3.0.7-0"

inherit catkin
