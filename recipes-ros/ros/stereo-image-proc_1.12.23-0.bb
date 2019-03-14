DESCRIPTION = "Stereo and single image rectification and disparity processing."
AUTHOR = "Patrick Mihelich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cv-bridge dynamic-reconfigure image-geometry image-proc image-transport message-filters nodelet sensor-msgs stereo-msgs cv-bridge dynamic-reconfigure image-geometry image-proc image-transport message-filters nodelet sensor-msgs stereo-msgs"

RDEPENDS_${PN} = "cv-bridge dynamic-reconfigure image-geometry image-proc image-transport message-filters nodelet sensor-msgs stereo-msgs"

SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/melodic/stereo_image_proc/1.12.23-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a525051bac54fb8fb8f50435fc234b5d"
SRC_URI[sha256sum] = "78bcb2383214fce1c9747f1c2b48c380281e6a7e3457fb192997daff5e33045a"

ROS_SPN = "image_pipeline"
S = "${WORKDIR}/image_pipeline-release-release-melodic-stereo_image_proc-1.12.23-0"

inherit catkin
