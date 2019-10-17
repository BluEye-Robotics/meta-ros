DESCRIPTION = "Low-level build system macros and infrastructure for ROS."
AUTHOR = "Troy Straszheim"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-empy  python-catkin-pkg gmock gtest python-empy python-nose"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/catkin-release/archive/release/melodic/catkin/0.7.17-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cce6712edd262faad496e1ca2827f270"
SRC_URI[sha256sum] = "316178707bc3f0edcb86a77ec2ec174b98b4d2ccf41306162cefe6588b3a9d41"

S = "${WORKDIR}/catkin-release-release-melodic-catkin-0.7.17-0"

inherit catkin
