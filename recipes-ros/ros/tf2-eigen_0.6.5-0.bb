DESCRIPTION = "tf2_eigen"
AUTHOR = "Koji Terada"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules libeigen geometry-msgs tf2 libeigen"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/melodic/tf2_eigen/0.6.5-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3d534445c1cefa078f2a894170357c9c"
SRC_URI[sha256sum] = "0097c690bd551d83154cc551b7d50439d86e8acda2bc4ebc307d1157cdf8c24d"

ROS_SPN = "geometry2"
S = "${WORKDIR}/geometry2-release-release-melodic-tf2_eigen-0.6.5-0"

inherit catkin
