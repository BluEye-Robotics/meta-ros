DESCRIPTION = "The mrpt_map is able to publish a mrpt map as ros occupancy grid like the map_server"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp tf std-msgs sensor-msgs nav-msgs mrpt-bridge mrpt1"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_navigation-release/archive/release/melodic/mrpt_map/0.1.24-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "85f22ed91c7df7b0557d5607f1d17740"
SRC_URI[sha256sum] = "0d3b69ed360dd1b9f7be6bc81108e7cb2f16c218d4c445b47af66315c0df6ebc"

ROS_SPN = "mrpt_navigation"
S = "${WORKDIR}/mrpt_navigation-release-release-melodic-mrpt_map-0.1.24-0"

inherit catkin
