DESCRIPTION = "This package provides a recovery behavior for the navigation stack that attempts to clear space by performing a 360 degree rotation of the robot."
AUTHOR = "Eitan Marder-Eppstein"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "angles base-local-planner cmake-modules costmap-2d libeigen geometry-msgs nav-core pluginlib roscpp tf2 tf2-geometry-msgs tf2-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/melodic/rotate_recovery/1.16.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6a7212d0a81f00dc37b97a29743b7d7b"
SRC_URI[sha256sum] = "c16310caacd9352ba89b5eb4903bb43349ee2b781b77157a33df6cfa39bc6a07"

ROS_SPN = "navigation"
S = "${WORKDIR}/navigation-release-release-melodic-rotate_recovery-1.16.2-0"

inherit catkin
