DESCRIPTION = "Collision checking and distance computation using the latest version of the FCL library."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "exotica-core geometric-shapes fcl-catkin"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipab-slmc/exotica-release/archive/release/melodic/exotica_collision_scene_fcl_latest/5.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c52158741b2d2de5d1c0264cc69fc008"
SRC_URI[sha256sum] = "3272a80421da42c672c81733bc649c88783104d945c886f589acf5fd90d97294"

ROS_SPN = "exotica"
S = "${WORKDIR}/exotica-release-release-melodic-exotica_collision_scene_fcl_latest-5.0.0-0"

inherit catkin
