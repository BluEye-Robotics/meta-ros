DESCRIPTION = "Time and Duration implementations for C++ libraries, including roscpp."
AUTHOR = "Josh Faust"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost cpp-common boost cpp-common"

RDEPENDS_${PN} = "boost cpp-common"

SRC_URI = "https://github.com/ros-gbp/roscpp_core-release/archive/release/melodic/rostime/0.6.13-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "13d4fed4d2edb8f308a2df3acec4656a"
SRC_URI[sha256sum] = "0aedc8397fb212ed0e019f63d739508a0b009e1a22943a86f8e4be20769b5157"

ROS_SPN = "roscpp_core"
S = "${WORKDIR}/roscpp_core-release-release-melodic-rostime-0.6.13-1"

inherit catkin
