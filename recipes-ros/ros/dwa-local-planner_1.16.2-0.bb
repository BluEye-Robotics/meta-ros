DESCRIPTION = "This package provides an implementation of the Dynamic Window Approach to local robot navigation on a plane. Given a global plan to follow and a costmap, the local planner produces velocity commands to send to a mobile base. This package supports any robot who's footprint can be represented as a convex polygon or cicrle, and exposes its configuration as ROS parameters that can be set in a launch file. The parameters for this planner are also dynamically reconfigurable. This package's ROS wrapper adheres to the BaseLocalPlanner interface specified in the"
AUTHOR = "Eitan Marder-Eppstein"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=23;endline=23;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "angles cmake-modules base-local-planner costmap-2d dynamic-reconfigure libeigen nav-core nav-msgs pluginlib sensor-msgs roscpp tf2 tf2-geometry-msgs tf2-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/melodic/dwa_local_planner/1.16.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8b2b9d6bef03a3b177e78c36da812654"
SRC_URI[sha256sum] = "e142fe402484f27336add5adf42e945d56d2495c629181704c8f2263757c0310"

ROS_SPN = "navigation"
S = "${WORKDIR}/navigation-release-release-melodic-dwa_local_planner-1.16.2-0"

inherit catkin
