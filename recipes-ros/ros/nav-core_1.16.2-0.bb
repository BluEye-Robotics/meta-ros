DESCRIPTION = "This package provides common interfaces for navigation specific robot actions. Currently, this package provides the BaseGlobalPlanner, BaseLocalPlanner, and RecoveryBehavior interfaces, which can be used to build actions that can easily swap their planner, local controller, or recovery behavior for new versions adhering to the same interface."
AUTHOR = "Eitan Marder-Eppstein"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "costmap-2d geometry-msgs std-msgs tf2-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/melodic/nav_core/1.16.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "12ca3b9e861f69d318e6b86f28b9fa2c"
SRC_URI[sha256sum] = "d598327496621c871e857d4fb92da871e9a7227397d849c94a7e49f993a239c3"

ROS_SPN = "navigation"
S = "${WORKDIR}/navigation-release-release-melodic-nav_core-1.16.2-0"

inherit catkin
