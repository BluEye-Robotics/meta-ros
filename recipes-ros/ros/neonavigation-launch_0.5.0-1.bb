DESCRIPTION = "Demonstration and sample launch files for neonavigation meta-package"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "costmap-cspace map-server planner-cspace safety-limiter tf2-ros trajectory-tracker trajectory-tracker-rviz-plugins"

SRC_URI = "https://github.com/at-wat/neonavigation-release/archive/release/melodic/neonavigation_launch/0.5.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "472562ce447ad08c6e754e731b1187ba"
SRC_URI[sha256sum] = "9ff56bf05cd10d9a91c7ac5835b07404cf4304bd88718b3ad98b130dbbaca826"

ROS_SPN = "neonavigation"
S = "${WORKDIR}/neonavigation-release-release-melodic-neonavigation_launch-0.5.0-1"

inherit catkin
