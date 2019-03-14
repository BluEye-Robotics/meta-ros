DESCRIPTION = "Contains nodelets for processing depth images such as those produced by OpenNI camera. Functions include creating disparity images and point clouds, as well as registering (reprojecting) a depth image into another camera frame."
AUTHOR = "Patrick Mihelich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost cmake-modules cv-bridge eigen-conversions image-geometry image-transport message-filters nodelet sensor-msgs stereo-msgs tf2 tf2-ros boost cv-bridge eigen-conversions image-geometry image-transport nodelet tf2 tf2-ros"

RDEPENDS_${PN} = "boost cv-bridge eigen-conversions image-geometry image-transport nodelet tf2 tf2-ros"

SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/melodic/depth_image_proc/1.12.23-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a5a5ce9dc4d89a7d2dc7ef71d7b39749"
SRC_URI[sha256sum] = "afd0f4eaae77e022b7c340519fda4b5c170e9fca7bfed5cc6888b0f081ad85a9"

ROS_SPN = "image_pipeline"
S = "${WORKDIR}/image_pipeline-release-release-melodic-depth_image_proc-1.12.23-0"

inherit catkin
