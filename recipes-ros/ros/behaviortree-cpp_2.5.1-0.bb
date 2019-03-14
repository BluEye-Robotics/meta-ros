DESCRIPTION = "This package provides a behavior trees core."
AUTHOR = "Michele Colledanchise"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "roslib libzmq3-dev roslib libzmq3-dev"

RDEPENDS_${PN} = "roslib libzmq3-dev"

SRC_URI = "https://github.com/BehaviorTree/behaviortree_cpp-release/archive/release/melodic/behaviortree_cpp/2.5.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a76c4afa71eae8c65e4679e44d9b36d9"
SRC_URI[sha256sum] = "cd1af27ccb2e5763fa4e9f02e23edf77fca7d1894d013a0d932e7f5ad05d337c"

S = "${WORKDIR}/behaviortree_cpp-release-release-melodic-behaviortree_cpp-2.5.1-0"

inherit catkin
