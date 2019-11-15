DESCRIPTION = "Assorted filters designed to operate on 2D planar laser scanners, which use the sensor_msgs/LaserScan type."
AUTHOR = "Tully Foote"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "sensor-msgs roscpp tf filters message-filters laser-geometry pluginlib rostest angles sensor-msgs roscpp tf filters message-filters laser-geometry pluginlib angles"

RDEPENDS_${PN} = "sensor-msgs roscpp tf filters message-filters laser-geometry pluginlib angles"

SRC_URI = "https://github.com/ros-gbp/laser_filters-release/archive/release/melodic/laser_filters/1.8.8-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9898c851c488b7797b47ab6bea3025ae"
SRC_URI[sha256sum] = "2511dc381cf42ca7373f5e34483ca8d75cdc2975f30aa84266a271723b91654d"

S = "${WORKDIR}/laser_filters-release-release-melodic-laser_filters-1.8.8-1"

inherit catkin
