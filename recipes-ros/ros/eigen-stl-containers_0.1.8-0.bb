DESCRIPTION = "This package provides a set of typedef's that allow using Eigen datatypes in STL containers"
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules libeigen libeigen"

RDEPENDS_${PN} = "libeigen"

SRC_URI = "https://github.com/ros-gbp/eigen_stl_containers-release/archive/release/melodic/eigen_stl_containers/0.1.8-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a737690c3c8142804bc2ce7a9c841d5e"
SRC_URI[sha256sum] = "e10632b9c182ffc09170b5fc80bf0a0f3cb8ab1091c01b44953042ba71ad5843"

S = "${WORKDIR}/eigen_stl_containers-release-release-melodic-eigen_stl_containers-0.1.8-0"

inherit catkin
