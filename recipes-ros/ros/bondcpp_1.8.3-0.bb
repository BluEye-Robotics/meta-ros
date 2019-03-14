DESCRIPTION = "C++ implementation of bond, a mechanism for checking when another process has terminated."
AUTHOR = "Stuart Glaser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules bond boost roscpp smclib"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/bond_core-release/archive/release/melodic/bondcpp/1.8.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1814bf1f4328a3281cae1559e06061bb"
SRC_URI[sha256sum] = "617c5cf1ac30c5af9d02024bef3b9a010ff70fb3779220d77eb9e4863530c790"

ROS_SPN = "bond_core"
S = "${WORKDIR}/bond_core-release-release-melodic-bondcpp-1.8.3-0"

inherit catkin
