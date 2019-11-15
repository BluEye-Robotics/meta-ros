DESCRIPTION = "Conversions between grid maps and Point Cloud Library (PCL) types."
AUTHOR = "Dominic Jud"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "grid-map-core pcl-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/anybotics/grid_map-release/archive/release/melodic/grid_map_pcl/1.6.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b8e627d3109d6ecf3575d279711cdad0"
SRC_URI[sha256sum] = "e1aa93cfb928982822724ae2f11a05178dbb848b54a96d2d6a696424b52b6b45"

ROS_SPN = "grid_map"
S = "${WORKDIR}/grid_map-release-release-melodic-grid_map_pcl-1.6.2-1"

inherit catkin
