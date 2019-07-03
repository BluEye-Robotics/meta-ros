DESCRIPTION = "Assorted filters designed to operate on 2D planar laser scanners, which use the sensor_msgs/LaserScan type."
AUTHOR = "Tully Foote"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "sensor-msgs roscpp tf filters message-filters laser-geometry pluginlib rostest angles sensor-msgs roscpp tf filters message-filters laser-geometry pluginlib angles"

RDEPENDS_${PN} = "sensor-msgs roscpp tf filters message-filters laser-geometry pluginlib angles"

SRC_URI = "https://github.com/ros-gbp/laser_filters-release/archive/release/melodic/laser_filters/1.8.7-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "75c8e9b87c5db95116d264b5bf2ecd62"
SRC_URI[sha256sum] = "4f67d8eb3aa88924ecb2b098095a25a4661af6632acd1feea5fd979060d18345"

S = "${WORKDIR}/laser_filters-release-release-melodic-laser_filters-1.8.7-1"

inherit catkin
