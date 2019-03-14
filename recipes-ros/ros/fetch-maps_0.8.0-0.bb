DESCRIPTION = "The fetch_maps package"
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_ros-release/archive/release/melodic/fetch_maps/0.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4e1eac32df5d3a80a9c8a060dcfbf98c"
SRC_URI[sha256sum] = "1f3107c5ae8dd4dcf0267d130821570e43c1def78ba42c564c61a0fc8b827a16"

ROS_SPN = "fetch_ros"
S = "${WORKDIR}/fetch_ros-release-release-melodic-fetch_maps-0.8.0-0"

inherit catkin
