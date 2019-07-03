DESCRIPTION = "Contains nodelets for processing depth images such as those produced by OpenNI camera. Functions include creating disparity images and point clouds, as well as registering (reprojecting) a depth image into another camera frame."
AUTHOR = "Patrick Mihelich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost cmake-modules cv-bridge eigen-conversions image-geometry image-transport message-filters nodelet sensor-msgs stereo-msgs tf2 tf2-ros boost cv-bridge eigen-conversions image-geometry image-transport nodelet tf2 tf2-ros"

RDEPENDS_${PN} = "boost cv-bridge eigen-conversions image-geometry image-transport nodelet tf2 tf2-ros"

SRC_URI = "https://github.com/ros-gbp/image_pipeline-release/archive/release/melodic/depth_image_proc/1.13.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "99e6ddaa94ba8e3cd0485ec5b258b062"
SRC_URI[sha256sum] = "9ef587dfb94e1ce789b97f3287d361570fd4e14019c248fa388797d388e839a2"

ROS_SPN = "image_pipeline"
S = "${WORKDIR}/image_pipeline-release-release-melodic-depth_image_proc-1.13.0-1"

inherit catkin
