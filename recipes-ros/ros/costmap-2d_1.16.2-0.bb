DESCRIPTION = "This package provides an implementation of a 2D costmap that takes in sensor data from the world, builds a 2D or 3D occupancy grid of the data (depending on whether a voxel based implementation is used), and inflates costs in a 2D costmap based on the occupancy grid and a user specified inflation radius. This package also provides support for map_server based initialization of a costmap, rolling window based costmaps, and parameter based subscription to and configuration of sensor topics."
AUTHOR = "Eitan Marder-Eppstein"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=22;endline=22;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "cmake-modules message-generation tf2-geometry-msgs tf2-sensor-msgs dynamic-reconfigure geometry-msgs laser-geometry map-msgs message-filters nav-msgs pluginlib roscpp rostest sensor-msgs std-msgs tf2 tf2-ros visualization-msgs voxel-grid"

RDEPENDS_${PN} = "message-runtime rosconsole"

SRC_URI = "https://github.com/ros-gbp/navigation-release/archive/release/melodic/costmap_2d/1.16.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c9913b302cbeb318ff74877a1312ea32"
SRC_URI[sha256sum] = "187901c824e86f552a2412c712120acad3e06efa0a9c8a44bb8c7d6c0832a1a1"

ROS_SPN = "navigation"
S = "${WORKDIR}/navigation-release-release-melodic-costmap_2d-1.16.2-0"

inherit catkin
