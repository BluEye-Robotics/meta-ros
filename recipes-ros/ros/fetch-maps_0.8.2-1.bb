DESCRIPTION = "The fetch_maps package"
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_ros-release/archive/release/melodic/fetch_maps/0.8.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3fd4f700de9f2d41ffe65558d3c702b9"
SRC_URI[sha256sum] = "6e100cd6d0b97d8afd7cfedd71b7a371200312b09c5d9f3feee2e38c1597346c"

ROS_SPN = "fetch_ros"
S = "${WORKDIR}/fetch_ros-release-release-melodic-fetch_maps-0.8.2-1"

inherit catkin
