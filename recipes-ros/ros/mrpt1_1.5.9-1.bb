DESCRIPTION = "Mobile Robot Programming Toolkit (MRPT) version 1. 5. x"
AUTHOR = "Jose-Luis Blanco-Claraco"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "assimp boost libeigen ffmpeg  libjpeg opencv libpcap libudev-dev libusb-1.0-dev octomap python python3-numpy suitesparse wx-common wxwidgets zlib"

RDEPENDS_${PN} = "catkin"

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt1-release/archive/release/melodic/mrpt1/1.5.9-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8e46cadeb2e4a091b2b097f93ac5d70c"
SRC_URI[sha256sum] = "3b46d8c2174663f750de2c3c6533f2284fdd117b1e9f3b238f986f7363f0fe26"

S = "${WORKDIR}/mrpt1-release-release-melodic-mrpt1-1.5.9-1"

inherit catkin
