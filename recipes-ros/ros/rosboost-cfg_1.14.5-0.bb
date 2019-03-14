DESCRIPTION = "Contains scripts used by the rosboost-cfg tool for determining cflags/lflags/etc. of boost on your system"
AUTHOR = "Josh Faust"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/melodic/rosboost_cfg/1.14.5-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4c02448093b110ae6b11ac0a421e5806"
SRC_URI[sha256sum] = "4c18eff7bb053836ee6cb4f6896ccbfb773f93ec6343bcd8f7cbe8f90101517c"

ROS_SPN = "ros"
S = "${WORKDIR}/ros-release-release-melodic-rosboost_cfg-1.14.5-0"

inherit catkin
