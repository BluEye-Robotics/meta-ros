DESCRIPTION = "ROS Package Tool"
AUTHOR = "Brian Gerkey"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules gtest boost pkgconfig python python3 libtinyxml2"

RDEPENDS_${PN} = "python3-catkin-pkg python3-catkin-pkg python3-rosdep python3-rosdep ros-environment"

SRC_URI = "https://github.com/ros-gbp/rospack-release/archive/release/melodic/rospack/2.5.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f7a58f4e6deffde43d6f14c0834deccc"
SRC_URI[sha256sum] = "15345b7f4f0182539a528059fc7bc9f44af682f8cdc90a5514e1a4c236e76b8a"

S = "${WORKDIR}/rospack-release-release-melodic-rospack-2.5.4-1"

inherit catkin
