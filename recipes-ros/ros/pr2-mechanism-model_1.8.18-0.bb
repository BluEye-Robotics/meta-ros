DESCRIPTION = ""
AUTHOR = "Eric Berger berger@willowgarage.com"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules roscpp pr2-hardware-interface urdf urdfdom kdl-parser pluginlib angles hardware-interface rostest rosunit roscpp pr2-hardware-interface urdf urdfdom kdl-parser pluginlib angles hardware-interface"

RDEPENDS_${PN} = "roscpp pr2-hardware-interface urdf urdfdom kdl-parser pluginlib angles hardware-interface"

SRC_URI = "https://github.com/pr2-gbp/pr2_mechanism-release/archive/release/melodic/pr2_mechanism_model/1.8.18-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "aedacbdca952462c0aa53df752f92c39"
SRC_URI[sha256sum] = "d20f677226a4c6286216f0b159340ec70dfc1a7473623ddd4c39c526f25947e0"

ROS_SPN = "pr2_mechanism"
S = "${WORKDIR}/pr2_mechanism-release-release-melodic-pr2_mechanism_model-1.8.18-0"

inherit catkin
