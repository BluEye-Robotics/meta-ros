DESCRIPTION = "Generates signed distance fields from grid maps."
AUTHOR = "Takahiro Miki"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "grid-map-core pcl-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/anybotics/grid_map-release/archive/release/melodic/grid_map_sdf/1.6.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b6340c8b7d195d148ab14e7d2528ace7"
SRC_URI[sha256sum] = "797729e8328b77ffa6a57b4ac35f26a4d101289619cfa3b555d253d20f9bd560"

ROS_SPN = "grid_map"
S = "${WORKDIR}/grid_map-release-release-melodic-grid_map_sdf-1.6.1-0"

inherit catkin
