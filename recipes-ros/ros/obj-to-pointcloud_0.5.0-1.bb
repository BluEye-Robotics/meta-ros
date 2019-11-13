DESCRIPTION = "OBJ file to pointcloud message converter package"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "pcl roscpp eigen-conversions geometry-msgs pcl-conversions sensor-msgs neonavigation-common libeigen"

RDEPENDS_${PN} = "libpcl-all"

SRC_URI = "https://github.com/at-wat/neonavigation-release/archive/release/melodic/obj_to_pointcloud/0.5.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e5df69108c7b3292e646691716b784ab"
SRC_URI[sha256sum] = "6ed341bd7ffa0e2f1b40c6161329a215a4ee50df690851028ba6e5558614e6e0"

ROS_SPN = "neonavigation"
S = "${WORKDIR}/neonavigation-release-release-melodic-obj_to_pointcloud-0.5.0-1"

inherit catkin
