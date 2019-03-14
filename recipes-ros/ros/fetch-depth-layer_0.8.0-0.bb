DESCRIPTION = "The fetch_depth_layer package"
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "costmap-2d cv-bridge geometry-msgs image-transport nav-msgs pluginlib roscpp sensor-msgs tf2-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_ros-release/archive/release/melodic/fetch_depth_layer/0.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f563927546d02fa36fb8e92bbbc67215"
SRC_URI[sha256sum] = "e1cfd4e3a0189c2cced8883704cdfe595d748b6df3acfcf4fa0a2cd98dc31f71"

ROS_SPN = "fetch_ros"
S = "${WORKDIR}/fetch_ros-release-release-melodic-fetch_depth_layer-0.8.0-0"

inherit catkin
