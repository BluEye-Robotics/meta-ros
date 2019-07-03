DESCRIPTION = "Mobile Robot Programming Toolkit (MRPT) version 1. 5. x"
AUTHOR = "Jose-Luis Blanco-Claraco"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "assimp boost libeigen ffmpeg  libjpeg opencv libpcap libudev-dev libusb-1.0-dev octomap python python-numpy suitesparse wx-common wxwidgets zlib"

RDEPENDS_${PN} = "catkin"

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt1-release/archive/release/melodic/mrpt1/1.5.8-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fc470b0cb447f723551bb22f26a66226"
SRC_URI[sha256sum] = "15161645758ce908438710546a1d48be2b0c663e8c22b764a2c291b166fc3287"

S = "${WORKDIR}/mrpt1-release-release-melodic-mrpt1-1.5.8-0"

inherit catkin
