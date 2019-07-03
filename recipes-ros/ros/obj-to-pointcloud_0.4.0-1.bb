DESCRIPTION = "OBJ file to pointcloud message converter package"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp eigen-conversions geometry-msgs pcl-ros sensor-msgs neonavigation-common libeigen"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/at-wat/neonavigation-release/archive/release/melodic/obj_to_pointcloud/0.4.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "540a662d158ef4229891e47950f92ce9"
SRC_URI[sha256sum] = "89ac151944c62cfc999ab2942aade69984c90e017ffd609f68599bc93d34f4a1"

ROS_SPN = "neonavigation"
S = "${WORKDIR}/neonavigation-release-release-melodic-obj_to_pointcloud-0.4.0-1"

inherit catkin
