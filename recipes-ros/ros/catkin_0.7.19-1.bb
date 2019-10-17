DESCRIPTION = "Low-level build system macros and infrastructure for ROS."
AUTHOR = "Troy Straszheim"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " python3-catkin-pkg python3-catkin-pkg python3-empy python3-empy gmock gtest python3-nose python3-nose"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/catkin-release/archive/release/melodic/catkin/0.7.19-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1aab509e22fb0dd956a77c850575a4da"
SRC_URI[sha256sum] = "10d50731008b2ab232a17cd1717d0b81d75d175b6f4b99a2e28ed4acc59df055"

S = "${WORKDIR}/catkin-release-release-melodic-catkin-0.7.19-1"

inherit catkin
