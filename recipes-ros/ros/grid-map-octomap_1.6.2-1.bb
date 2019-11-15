DESCRIPTION = "Conversions between grid maps and OctoMap types."
AUTHOR = "Jeff Delmerico"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "grid-map-core octomap"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/anybotics/grid_map-release/archive/release/melodic/grid_map_octomap/1.6.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e1a7f4802302feeda7d18345f322eef0"
SRC_URI[sha256sum] = "6f5113c1b3e4459b22a411ac42ad5d476f786bf914783c5b60c2228fb7121048"

ROS_SPN = "grid_map"
S = "${WORKDIR}/grid_map-release-release-melodic-grid_map_octomap-1.6.2-1"

inherit catkin
