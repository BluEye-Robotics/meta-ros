DESCRIPTION = "Contains scripts used by the rosboost-cfg tool for determining cflags/lflags/etc. of boost on your system"
AUTHOR = "Josh Faust"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/melodic/rosboost_cfg/1.14.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "07f22e8ae17d5bd448dc58d90f957c1d"
SRC_URI[sha256sum] = "1aad8d583287e022e1f74e4093b5279383ec65589461a3345941daa136b2e57e"

ROS_SPN = "ros"
S = "${WORKDIR}/ros-release-release-melodic-rosboost_cfg-1.14.6-0"

inherit catkin
