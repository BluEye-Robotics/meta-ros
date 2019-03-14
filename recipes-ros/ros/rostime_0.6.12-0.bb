DESCRIPTION = "Time and Duration implementations for C++ libraries, including roscpp."
AUTHOR = "Josh Faust"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost cpp-common boost cpp-common"

RDEPENDS_${PN} = "boost cpp-common"

SRC_URI = "https://github.com/ros-gbp/roscpp_core-release/archive/release/melodic/rostime/0.6.12-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "39fd0471bb38c5f779b491c8b8599072"
SRC_URI[sha256sum] = "d99a7287aca9e4fad4aeae4c8fedfd9d69c8ccf7977b0488bd27d5c57c5fb208"

ROS_SPN = "roscpp_core"
S = "${WORKDIR}/roscpp_core-release-release-melodic-rostime-0.6.12-0"

inherit catkin
