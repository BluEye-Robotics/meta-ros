DESCRIPTION = "image_pipeline fills the gap between getting raw images from a camera driver and higher-level vision processing."
AUTHOR = "Patrick Mihelich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-calibration depth-image-proc image-proc image-publisher image-rotate image-view stereo-image-proc"

RDEPENDS_${PN} = "camera-calibration depth-image-proc image-proc image-publisher image-rotate image-view stereo-image-proc"

SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/melodic/image_pipeline/1.12.23-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a28d68df17541f7216448c02f30fec20"
SRC_URI[sha256sum] = "a6e5d39fd81ad438d67124e646c3da415e14afb3d0e59931e0d40433a6c1ea77"

S = "${WORKDIR}/image_pipeline-release-release-melodic-image_pipeline-1.12.23-0"

inherit catkin
