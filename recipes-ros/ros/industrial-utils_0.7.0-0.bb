DESCRIPTION = "Industrial utils is a library package that captures common funcitonality for the ROS-Industrial distribution."
AUTHOR = "Shaun M. Edwards"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp urdf roscpp urdf"

RDEPENDS_${PN} = "roscpp urdf"

SRC_URI = "https://github.com/ros-industrial-release/industrial_core-release/archive/release/melodic/industrial_utils/0.7.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "69f8604d1184758305c06c715b79fb0c"
SRC_URI[sha256sum] = "6615952de07963890fa787cba410b69c8a7d947158281eefc629c8e92c88bf51"

ROS_SPN = "industrial_core"
S = "${WORKDIR}/industrial_core-release-release-melodic-industrial_utils-0.7.0-0"

inherit catkin
