DESCRIPTION = "Collision checking using the FCL library."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "exotica-core geometric-shapes fcl roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipab-slmc/exotica-release/archive/release/melodic/exotica_collision_scene_fcl/5.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "241cf18698f9c3f4443e2f2eed76a14e"
SRC_URI[sha256sum] = "23429b82aedb7a582949ddaf683f933d6faea4923f01cd71d129e755899ac649"

ROS_SPN = "exotica"
S = "${WORKDIR}/exotica-release-release-melodic-exotica_collision_scene_fcl-5.0.0-0"

inherit catkin
