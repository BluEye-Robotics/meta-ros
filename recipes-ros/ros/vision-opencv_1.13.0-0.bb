DESCRIPTION = "Packages for interfacing ROS with OpenCV, a library of programming functions for real time computer vision."
AUTHOR = "Patrick Mihelich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cv-bridge image-geometry"

RDEPENDS_${PN} = "cv-bridge image-geometry"

SRC_URI = "https://github.com/ros-gbp/vision_opencv-release/archive/release/melodic/vision_opencv/1.13.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2d42baa0b77c3caf95fc25495f375089"
SRC_URI[sha256sum] = "21275f9903d17bd95c5f01a674548451006a015a2c43b4da143bb7c149667404"

S = "${WORKDIR}/vision_opencv-release-release-melodic-vision_opencv-1.13.0-0"

inherit catkin
