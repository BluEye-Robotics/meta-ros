DESCRIPTION = "Assorted filters designed to operate on 2D planar laser scanners, which use the sensor_msgs/LaserScan type."
AUTHOR = "Tully Foote"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "sensor-msgs roscpp tf filters message-filters laser-geometry pluginlib rostest angles sensor-msgs roscpp tf filters message-filters laser-geometry pluginlib angles"

RDEPENDS_${PN} = "sensor-msgs roscpp tf filters message-filters laser-geometry pluginlib angles"

SRC_URI = "https://github.com/ros-gbp/laser_filters-release/archive/release/melodic/laser_filters/1.8.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "44cf7b6c0f63d168fba55c720b1e3f06"
SRC_URI[sha256sum] = "7429472a08b080cae1e101e9e96443b884791926ad59479c553809669347d46e"

S = "${WORKDIR}/laser_filters-release-release-melodic-laser_filters-1.8.6-0"

inherit catkin
