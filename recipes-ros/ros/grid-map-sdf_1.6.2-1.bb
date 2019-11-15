DESCRIPTION = "Generates signed distance fields from grid maps."
AUTHOR = "Takahiro Miki"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "grid-map-core pcl-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/anybotics/grid_map-release/archive/release/melodic/grid_map_sdf/1.6.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c9cafbe19d31e7962be7d17e4b87b2d1"
SRC_URI[sha256sum] = "2ba1a46be320ddf71fc6054c315faee0f1aed95608e024e90d0abce7975c602c"

ROS_SPN = "grid_map"
S = "${WORKDIR}/grid_map-release-release-melodic-grid_map_sdf-1.6.2-1"

inherit catkin
