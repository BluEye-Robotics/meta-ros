DESCRIPTION = "The mrpt_map is able to publish a mrpt map as ros occupancy grid like the map_server"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp tf std-msgs sensor-msgs nav-msgs mrpt-bridge mrpt1"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_navigation-release/archive/release/melodic/mrpt_map/0.1.26-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5f7af447099bb40cccfab607c4cd1b8c"
SRC_URI[sha256sum] = "1347d1084c5cd1bfbaf3b6fad8db1512c848d49ef81612f5be09837787dcf6a9"

ROS_SPN = "mrpt_navigation"
S = "${WORKDIR}/mrpt_navigation-release-release-melodic-mrpt_map-0.1.26-1"

inherit catkin
