DESCRIPTION = "This package provides a recovery behavior for the navigation stack that attempts to clear space by reverting the costmaps used by the navigation stack to the static map outside of a given area."
AUTHOR = "Eitan Marder-Eppstein"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "cmake-modules costmap-2d libeigen nav-core pluginlib roscpp tf2-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/melodic/clear_costmap_recovery/1.16.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7a1d58f682a77ad54b415dbc2e9ebbed"
SRC_URI[sha256sum] = "9844494fbe4443e201302dfd5a6fae1246fe452f38432696d0613c2405283572"

ROS_SPN = "navigation"
S = "${WORKDIR}/navigation-release-release-melodic-clear_costmap_recovery-1.16.2-0"

inherit catkin
