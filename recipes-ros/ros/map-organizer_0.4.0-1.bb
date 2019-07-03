DESCRIPTION = "Layered costmap organizer package"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp eigen-conversions geometry-msgs map-server nav-msgs pcl-ros sensor-msgs tf2 tf2-geometry-msgs tf2-ros map-organizer-msgs neonavigation-common cmake-modules libeigen"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/at-wat/neonavigation-release/archive/release/melodic/map_organizer/0.4.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f56d8702c29dcc6e133cc08ad82cd7f4"
SRC_URI[sha256sum] = "481d64812b1eaae9e91d0e3651218181f9da90505b02bb33e5a90e4ece7360ba"

ROS_SPN = "neonavigation"
S = "${WORKDIR}/neonavigation-release-release-melodic-map_organizer-0.4.0-1"

inherit catkin
