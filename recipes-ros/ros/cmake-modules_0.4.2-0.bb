DESCRIPTION = "A common repository for CMake Modules which are not distributed with CMake but are commonly used by ROS packages."
AUTHOR = "William Woodall"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/cmake_modules-release/archive/release/melodic/cmake_modules/0.4.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c788358b7850eb9a6732b572a78247cb"
SRC_URI[sha256sum] = "3598bda2ce4a55fdbe097c3d5c16cee1735b180cf234fea89628d78ea88da0bb"

S = "${WORKDIR}/cmake_modules-release-release-melodic-cmake_modules-0.4.2-0"

inherit catkin
