DESCRIPTION = "Contains scripts used by the rosboost-cfg tool for determining cflags/lflags/etc. of boost on your system"
AUTHOR = "Josh Faust"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/melodic/rosboost_cfg/1.14.7-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "59fa90fd69e08a8822142641e5b673c8"
SRC_URI[sha256sum] = "13ad3af364705f97b8d872dc3de8f12930ef448ac6119f527f36bbed82925e2c"

ROS_SPN = "ros"
S = "${WORKDIR}/ros-release-release-melodic-rosboost_cfg-1.14.7-1"

inherit catkin
