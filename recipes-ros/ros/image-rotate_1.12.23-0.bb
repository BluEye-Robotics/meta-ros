DESCRIPTION = ""
AUTHOR = "Blaise Gassend"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=26;endline=26;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules cv-bridge dynamic-reconfigure geometry-msgs image-transport nodelet roscpp tf2 tf2-geometry-msgs tf2-ros cv-bridge dynamic-reconfigure image-transport nodelet roscpp tf2 tf2-geometry-msgs tf2-ros"

RDEPENDS_${PN} = "cv-bridge dynamic-reconfigure image-transport nodelet roscpp tf2 tf2-geometry-msgs tf2-ros"

SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/melodic/image_rotate/1.12.23-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3db2d8d3febcdef288f5abf253d19a90"
SRC_URI[sha256sum] = "300158018b97ce2b2f3cdfac00889d443b74165b3fb49105317148c76657638a"

ROS_SPN = "image_pipeline"
S = "${WORKDIR}/image_pipeline-release-release-melodic-image_rotate-1.12.23-0"

inherit catkin
