DESCRIPTION = "3-dof configuration space planner for mobile robot"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp actionlib diagnostic-updater geometry-msgs move-base-msgs nav-msgs sensor-msgs std-srvs trajectory-msgs tf2 tf2-geometry-msgs tf2-ros costmap-cspace costmap-cspace-msgs neonavigation-common planner-cspace-msgs trajectory-tracker-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/at-wat/neonavigation-release/archive/release/melodic/planner_cspace/0.4.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c41f83282212cae72d32433f2729720c"
SRC_URI[sha256sum] = "a351ffe8a5433acc6b289ff3b75d8018745e1dde317e153a11c9235afd9e9515"

ROS_SPN = "neonavigation"
S = "${WORKDIR}/neonavigation-release-release-melodic-planner_cspace-0.4.3-1"

inherit catkin
