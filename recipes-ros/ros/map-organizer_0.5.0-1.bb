DESCRIPTION = "Layered costmap organizer package"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "pcl roscpp eigen-conversions geometry-msgs map-server nav-msgs pcl-conversions sensor-msgs tf2 tf2-geometry-msgs tf2-ros map-organizer-msgs neonavigation-common cmake-modules libeigen"

RDEPENDS_${PN} = "libpcl-all"

SRC_URI = "https://github.com/at-wat/neonavigation-release/archive/release/melodic/map_organizer/0.5.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0d6eab4717467846441d266575e5eb26"
SRC_URI[sha256sum] = "4566f7c609e8be53aa43a3d4e33bdc28c72925839e485fd8fd26a1c4caff9c3f"

ROS_SPN = "neonavigation"
S = "${WORKDIR}/neonavigation-release-release-melodic-map_organizer-0.5.0-1"

inherit catkin
