DESCRIPTION = "Launch files to open an RGBD device and load all nodelets to convert raw depth/RGB/IR streams to depth images, disparity images, and (registered) point clouds."
AUTHOR = "Patrick Mihelich and others"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "depth-image-proc image-proc nodelet tf2-ros depth-image-proc image-proc nodelet tf2-ros"

RDEPENDS_${PN} = "depth-image-proc image-proc nodelet tf2-ros"

SRC_URI = "https://github.com/ros-gbp/rgbd_launch-release/archive/release/melodic/rgbd_launch/2.2.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8bc18e4a10fe2de121632c4d750c8594"
SRC_URI[sha256sum] = "973d8f054d8b7447e8951b5dc8dc65d860a3ce48431789fee0f582d8d56d7f68"

S = "${WORKDIR}/rgbd_launch-release-release-melodic-rgbd_launch-2.2.2-0"

inherit catkin
