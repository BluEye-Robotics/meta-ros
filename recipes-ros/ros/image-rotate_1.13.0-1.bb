DESCRIPTION = ""
AUTHOR = "Blaise Gassend"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=28;endline=28;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules cv-bridge dynamic-reconfigure geometry-msgs image-transport nodelet roscpp tf2 tf2-geometry-msgs tf2-ros cv-bridge dynamic-reconfigure image-transport nodelet roscpp tf2 tf2-geometry-msgs tf2-ros"

RDEPENDS_${PN} = "cv-bridge dynamic-reconfigure image-transport nodelet roscpp tf2 tf2-geometry-msgs tf2-ros"

SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/melodic/image_rotate/1.13.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "28de2f1891fb0a7ded0ff6b4830404d1"
SRC_URI[sha256sum] = "bbfb1e066ba98a6f4ea1d3b7586dc0f25219e3716f025a97f6d1b7b1587ddaf5"

ROS_SPN = "image_pipeline"
S = "${WORKDIR}/image_pipeline-release-release-melodic-image_rotate-1.13.0-1"

inherit catkin
