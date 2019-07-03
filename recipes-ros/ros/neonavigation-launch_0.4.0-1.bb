DESCRIPTION = "Demonstration and sample launch files for neonavigation meta-package"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "costmap-cspace map-server planner-cspace safety-limiter tf2-ros trajectory-tracker trajectory-tracker-rviz-plugins"

SRC_URI = "https://github.com/at-wat/neonavigation-release/archive/release/melodic/neonavigation_launch/0.4.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e4cdd82159cdff4d0e22da0284936cb6"
SRC_URI[sha256sum] = "e7f679f343d30ebfde6def5bee3a5c5c7a7eee19ead9d5ba61ae03bc1f6522d3"

ROS_SPN = "neonavigation"
S = "${WORKDIR}/neonavigation-release-release-melodic-neonavigation_launch-0.4.0-1"

inherit catkin
