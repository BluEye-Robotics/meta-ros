DESCRIPTION = "The move_base package provides an implementation of an action (see the"
AUTHOR = "Eitan Marder-Eppstein"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "cmake-modules message-generation tf2-geometry-msgs actionlib costmap-2d dynamic-reconfigure geometry-msgs move-base-msgs nav-core nav-msgs pluginlib roscpp rospy std-srvs tf2-ros visualization-msgs base-local-planner clear-costmap-recovery navfn rotate-recovery"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/melodic/move_base/1.16.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "86eb48954e9962d380017c057c0be525"
SRC_URI[sha256sum] = "63af31b19a053e4877e0af0d899b59da73df19a65258c8a823f41afed51e851d"

ROS_SPN = "navigation"
S = "${WORKDIR}/navigation-release-release-melodic-move_base-1.16.2-0"

inherit catkin
