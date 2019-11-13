DESCRIPTION = "3-dof configuration space planner for mobile robot"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp actionlib diagnostic-updater geometry-msgs move-base-msgs nav-msgs sensor-msgs std-srvs trajectory-msgs tf2 tf2-geometry-msgs tf2-ros costmap-cspace costmap-cspace-msgs neonavigation-common planner-cspace-msgs trajectory-tracker-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/at-wat/neonavigation-release/archive/release/melodic/planner_cspace/0.5.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d782306a00338f57c79de2aa0c317dd8"
SRC_URI[sha256sum] = "e7d41fc10fca03382470ea9b0f951df27eb1f40e51823c64f1b67cd1328f4927"

ROS_SPN = "neonavigation"
S = "${WORKDIR}/neonavigation-release-release-melodic-planner_cspace-0.5.0-1"

inherit catkin
