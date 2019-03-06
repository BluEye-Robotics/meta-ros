DESCRIPTION = "Assorted filters designed to operate on 2D planar laser scanners, which use the \
sensor_msgs/LaserScan type."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles filters laser-geometry message-filters pluginlib roscpp sensor-msgs tf"

SRC_URI = "https://github.com/ros-perception/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "0caf4894f9337b6ca1eb8cf5ef226f0e"
SRC_URI[sha256sum] = "c9678edee036ddb42a2dea1e71609763b44d6d1618fe384b204f3caa7d77ea3d"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
