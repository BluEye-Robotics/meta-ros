DESCRIPTION = "The fetch_depth_layer package"
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "costmap-2d cv-bridge geometry-msgs image-transport nav-msgs pluginlib roscpp sensor-msgs tf2-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_ros-release/archive/release/melodic/fetch_depth_layer/0.8.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "62000f8349af339c8ec5c851cdfbbf01"
SRC_URI[sha256sum] = "2282dd7a2307b872015212dcdca14f3efba3e36f80f930d8b98a5ef728f8f99b"

ROS_SPN = "fetch_ros"
S = "${WORKDIR}/fetch_ros-release-release-melodic-fetch_depth_layer-0.8.2-1"

inherit catkin
