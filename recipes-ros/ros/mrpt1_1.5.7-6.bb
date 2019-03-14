DESCRIPTION = "Mobile Robot Programming Toolkit (MRPT) version 1. 5. x"
AUTHOR = "Jose-Luis Blanco-Claraco"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libeigen ffmpeg  libjpeg opencv libpcap libudev-dev libusb-1.0-dev suitesparse wx-common wxwidgets zlib assimp octomap"

RDEPENDS_${PN} = "catkin"

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt1-release/archive/release/melodic/mrpt1/1.5.7-6.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a68a9b542ef6507f275d36bda3cd53cc"
SRC_URI[sha256sum] = "b450ce4344eb9f5015268ff6fa680f25579f1f5bfcc7779d2cd2cfe96f109d7f"

S = "${WORKDIR}/mrpt1-release-release-melodic-mrpt1-1.5.7-6"

inherit catkin
