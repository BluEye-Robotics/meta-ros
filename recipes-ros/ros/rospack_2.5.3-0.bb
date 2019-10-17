DESCRIPTION = "ROS Package Tool"
AUTHOR = "Brian Gerkey"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost cmake-modules gtest pkgconfig python libtinyxml2 boost pkgconfig python python-catkin-pkg python-rosdep ros-environment libtinyxml2"

RDEPENDS_${PN} = "boost pkgconfig python python-catkin-pkg python-rosdep ros-environment libtinyxml2"

SRC_URI = "https://github.com/ros-gbp/rospack-release/archive/release/melodic/rospack/2.5.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "dee4f1a984314a61732ea3da5ea27894"
SRC_URI[sha256sum] = "0b9db7d9b7c20d8f36204d3bda08ef5cf41f3f8f7e009862102603b9daf65429"

S = "${WORKDIR}/rospack-release-release-melodic-rospack-2.5.3-0"

inherit catkin
