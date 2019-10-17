DESCRIPTION = "Demonstration and sample launch files for neonavigation meta-package"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "costmap-cspace map-server planner-cspace safety-limiter tf2-ros trajectory-tracker trajectory-tracker-rviz-plugins"

SRC_URI = "https://github.com/at-wat/neonavigation-release/archive/release/melodic/neonavigation_launch/0.4.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1748eba613709c35277e02e613a2d876"
SRC_URI[sha256sum] = "884e164ae66cfc46c47acf497bdda11b34342518bfe019b3e2f2c9b30a0abbc7"

ROS_SPN = "neonavigation"
S = "${WORKDIR}/neonavigation-release-release-melodic-neonavigation_launch-0.4.3-1"

inherit catkin
