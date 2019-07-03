DESCRIPTION = "image_pipeline fills the gap between getting raw images from a camera driver and higher-level vision processing."
AUTHOR = "Patrick Mihelich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-calibration depth-image-proc image-proc image-publisher image-rotate image-view stereo-image-proc"

RDEPENDS_${PN} = "camera-calibration depth-image-proc image-proc image-publisher image-rotate image-view stereo-image-proc"

SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/melodic/image_pipeline/1.13.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "493827311719db21a34fdf0a9b65c3a5"
SRC_URI[sha256sum] = "f036a5cd94826cc5b2d5713cb2594dc5835ff3245d64637f476c0564d510a99c"

S = "${WORKDIR}/image_pipeline-release-release-melodic-image_pipeline-1.13.0-1"

inherit catkin
