DESCRIPTION = "ROS console output library."
AUTHOR = "Josh Faust"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "apr boost cpp-common log4cxx rostime rosunit apr cpp-common log4cxx rosbuild rostime"

RDEPENDS_${PN} = "apr cpp-common log4cxx rosbuild rostime"

SRC_URI = "https://github.com/ros-gbp/rosconsole-release/archive/release/melodic/rosconsole/1.13.11-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d9a9531278238ef04b3f6d405d8673fb"
SRC_URI[sha256sum] = "a3e3a70918afe751f2ddfeb9c2f5d25986bd0e5fa305bb3c8857349dc1410aea"

S = "${WORKDIR}/rosconsole-release-release-melodic-rosconsole-1.13.11-1"

inherit catkin
