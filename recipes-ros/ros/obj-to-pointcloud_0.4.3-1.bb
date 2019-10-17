DESCRIPTION = "OBJ file to pointcloud message converter package"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "pcl roscpp eigen-conversions geometry-msgs pcl-conversions sensor-msgs neonavigation-common libeigen"

RDEPENDS_${PN} = "libpcl-all"

SRC_URI = "https://github.com/at-wat/neonavigation-release/archive/release/melodic/obj_to_pointcloud/0.4.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d718a604d4a09830c4023a1bc312e7c3"
SRC_URI[sha256sum] = "67fdbf362e27f92ebf6c0b4d3214d3091d8e1d2e88c7ba9981a92ae114198d37"

ROS_SPN = "neonavigation"
S = "${WORKDIR}/neonavigation-release-release-melodic-obj_to_pointcloud-0.4.3-1"

inherit catkin
