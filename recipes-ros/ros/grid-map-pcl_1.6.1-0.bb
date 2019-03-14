DESCRIPTION = "Conversions between grid maps and Point Cloud Library (PCL) types."
AUTHOR = "Dominic Jud"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "grid-map-core pcl-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/anybotics/grid_map-release/archive/release/melodic/grid_map_pcl/1.6.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1d8866e4e205e09a2ab24af518782785"
SRC_URI[sha256sum] = "cd37b6d275b0d1afa0755a76162c63914f46c02465318338481db82341e0fba9"

ROS_SPN = "grid_map"
S = "${WORKDIR}/grid_map-release-release-melodic-grid_map_pcl-1.6.1-0"

inherit catkin
