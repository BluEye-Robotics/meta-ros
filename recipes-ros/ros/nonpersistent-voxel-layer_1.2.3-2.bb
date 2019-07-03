DESCRIPTION = "include This package provides an implementation of a 3D costmap that takes in sensor data from the world, builds a 3D occupancy grid of the data for only one iteration."
AUTHOR = "Steven Macenski"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "cmake-modules dynamic-reconfigure geometry-msgs laser-geometry map-msgs message-filters message-generation nav-msgs pcl-conversions pcl-ros pluginlib roscpp sensor-msgs std-msgs tf visualization-msgs voxel-grid costmap-2d dynamic-reconfigure geometry-msgs laser-geometry map-msgs message-filters message-runtime nav-msgs pcl-conversions pcl-ros pluginlib rosconsole roscpp sensor-msgs std-msgs tf visualization-msgs voxel-grid costmap-2d"

RDEPENDS_${PN} = "dynamic-reconfigure geometry-msgs laser-geometry map-msgs message-filters message-runtime nav-msgs pcl-conversions pcl-ros pluginlib rosconsole roscpp sensor-msgs std-msgs tf visualization-msgs voxel-grid costmap-2d"

SRC_URI = "https://github.com/SteveMacenski/nonpersistent_voxel_layer-release/archive/release/melodic/nonpersistent_voxel_layer/1.2.3-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "76b44db47e8a3c65543a6977875a0500"
SRC_URI[sha256sum] = "3c8ab56ed99d7856535320eaaedb8670bbf5115258808a22a1b6531ff9308107"

S = "${WORKDIR}/nonpersistent_voxel_layer-release-release-melodic-nonpersistent_voxel_layer-1.2.3-2"

inherit catkin
