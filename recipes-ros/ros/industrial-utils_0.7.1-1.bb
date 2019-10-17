DESCRIPTION = "Industrial utils is a library package that captures common funcitonality for the ROS-Industrial distribution."
AUTHOR = "Shaun Edwards"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp urdf"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-industrial-release/industrial_core-release/archive/release/melodic/industrial_utils/0.7.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d4911276c276b9224e274f6c05966eb8"
SRC_URI[sha256sum] = "c27a7592fb1c7e08f7b88330936da7dd70647e414514b1e1b2e198324c64916c"

ROS_SPN = "industrial_core"
S = "${WORKDIR}/industrial_core-release-release-melodic-industrial_utils-0.7.1-1"

inherit catkin
