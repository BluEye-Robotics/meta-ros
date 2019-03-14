DESCRIPTION = "This planner attempts to find a legal place to put a carrot for the robot to follow. It does this by moving back along the vector between the robot and the goal point."
AUTHOR = "Eitan Marder-Eppstein"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "tf2-geometry-msgs base-local-planner costmap-2d libeigen nav-core pluginlib roscpp tf2 tf2-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/melodic/carrot_planner/1.16.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b7db616b390edf77a1bfc0c2ab40d93f"
SRC_URI[sha256sum] = "a5d041ba34682f24432fac22801b54a438dc58d3e13e1a4dde1e81e09d2c3ab4"

ROS_SPN = "navigation"
S = "${WORKDIR}/navigation-release-release-melodic-carrot_planner-1.16.2-0"

inherit catkin
