DESCRIPTION = "Single image rectification and color processing."
AUTHOR = "Patrick Mihelich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost cv-bridge dynamic-reconfigure image-geometry image-transport nodelet nodelet-topic-tools roscpp sensor-msgs cv-bridge dynamic-reconfigure image-geometry image-transport nodelet nodelet-topic-tools roscpp sensor-msgs"

RDEPENDS_${PN} = "cv-bridge dynamic-reconfigure image-geometry image-transport nodelet nodelet-topic-tools roscpp sensor-msgs"

SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/melodic/image_proc/1.12.23-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "590063c5e81f6b731414e4a10d8584c4"
SRC_URI[sha256sum] = "93803bd635f79e7a5c87d295d612a389f21af03603f691b8c392ca9c894c6939"

ROS_SPN = "image_pipeline"
S = "${WORKDIR}/image_pipeline-release-release-melodic-image_proc-1.12.23-0"

inherit catkin
