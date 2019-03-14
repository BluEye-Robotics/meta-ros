DESCRIPTION = "The mrpt_map is able to publish a mrpt map as ros occupancy grid like the map_server"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp tf std-msgs sensor-msgs nav-msgs mrpt-bridge mrpt1"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_navigation-release/archive/release/melodic/mrpt_map/0.1.22-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "780d1ddef03d63938ead39d67e20cf1c"
SRC_URI[sha256sum] = "9620d164fb59997297313762cb169518e24f22b8be119ce7f7edf07624678832"

ROS_SPN = "mrpt_navigation"
S = "${WORKDIR}/mrpt_navigation-release-release-melodic-mrpt_map-0.1.22-0"

inherit catkin
