DESCRIPTION = "This package provides a kinematics implementation for the PR2 robot. It can be used to compute forward and inverse kinematics."
AUTHOR = "Sachin Chitta"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp angles tf-conversions urdf geometry-msgs kdl-parser pluginlib moveit-msgs moveit-core cmake-modules moveit-core roscpp angles tf-conversions urdf geometry-msgs kdl-parser pluginlib moveit-msgs"

RDEPENDS_${PN} = "moveit-core roscpp angles tf-conversions urdf geometry-msgs kdl-parser pluginlib moveit-msgs"

SRC_URI = "https://github.com/pr2-gbp/pr2_kinematics-release/archive/release/melodic/pr2_arm_kinematics/1.0.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "72d87b23543dea22a62ddd7fee5999cd"
SRC_URI[sha256sum] = "ad182e7a84e3e1448a25ab252edae3155e4cb6d27180b1c16e56ce29c656677d"

ROS_SPN = "pr2_kinematics"
S = "${WORKDIR}/pr2_kinematics-release-release-melodic-pr2_arm_kinematics-1.0.10-0"

inherit catkin
