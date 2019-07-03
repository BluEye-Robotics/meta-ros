DESCRIPTION = "multisense_description"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/carnegieroboticsllc/multisense_ros-release/archive/release/melodic/multisense_description/4.0.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cc5b3d12334f067f07ac76a175f7e700"
SRC_URI[sha256sum] = "373f9f158ad72ceeab6812656bf4a4aa64bc30ec54d4587856e26c86e14ac766"

ROS_SPN = "multisense_ros"
S = "${WORKDIR}/multisense_ros-release-release-melodic-multisense_description-4.0.2-0"

inherit catkin
