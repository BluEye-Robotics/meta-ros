DESCRIPTION = "Layered costmap organizer package"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "pcl roscpp eigen-conversions geometry-msgs map-server nav-msgs pcl-conversions sensor-msgs tf2 tf2-geometry-msgs tf2-ros map-organizer-msgs neonavigation-common cmake-modules libeigen"

RDEPENDS_${PN} = "libpcl-all"

SRC_URI = "https://github.com/at-wat/neonavigation-release/archive/release/melodic/map_organizer/0.4.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c2d6170d2e3a8de462bd18f7fd34f283"
SRC_URI[sha256sum] = "1b961e5b2992418a9c607889a5bafd320c4239f2b8f34147fe8a4739abbd0912"

ROS_SPN = "neonavigation"
S = "${WORKDIR}/neonavigation-release-release-melodic-map_organizer-0.4.3-1"

inherit catkin
