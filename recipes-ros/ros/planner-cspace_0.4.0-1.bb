DESCRIPTION = "3-dof configuration space planner for mobile robot"
AUTHOR = "Atsushi Watanabe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp actionlib diagnostic-updater geometry-msgs move-base-msgs nav-msgs sensor-msgs std-srvs trajectory-msgs tf2 tf2-geometry-msgs tf2-ros costmap-cspace costmap-cspace-msgs neonavigation-common planner-cspace-msgs trajectory-tracker-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/at-wat/neonavigation-release/archive/release/melodic/planner_cspace/0.4.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "673dfee9f160ebe68d7962f6ea85813b"
SRC_URI[sha256sum] = "c05e7dbbe8f20d827ec6a46881397f450c9add40c4d69a21ae2df226e762f057"

ROS_SPN = "neonavigation"
S = "${WORKDIR}/neonavigation-release-release-melodic-planner_cspace-0.4.0-1"

inherit catkin
