DESCRIPTION = "This package provides implementations of the Trajectory Rollout and Dynamic Window approaches to local robot navigation on a plane. Given a plan to follow and a costmap, the controller produces velocity commands to send to a mobile base. This package supports both holonomic and non-holonomic robots, any robot footprint that can be represented as a convex polygon or circle, and exposes its configuration as ROS parameters that can be set in a launch file. This package's ROS wrapper adheres to the BaseLocalPlanner interface specified in the"
AUTHOR = "Eitan Marder-Eppstein"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "cmake-modules message-generation tf2-geometry-msgs angles costmap-2d dynamic-reconfigure libeigen geometry-msgs nav-core nav-msgs pluginlib sensor-msgs std-msgs rosconsole roscpp rospy tf2 tf2-ros visualization-msgs voxel-grid"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/melodic/base_local_planner/1.16.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0edad429c73aa2880786f8f92a3352d4"
SRC_URI[sha256sum] = "1c14d73638bd309260ffb06d9a97853ab875b6ab6d6e6723ca8398f6ae0d58a8"

ROS_SPN = "navigation"
S = "${WORKDIR}/navigation-release-release-melodic-base_local_planner-1.16.2-0"

inherit catkin
