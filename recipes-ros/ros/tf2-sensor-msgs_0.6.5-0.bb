DESCRIPTION = "Small lib to transform sensor_msgs with tf. Most notably, PointCloud2"
AUTHOR = "Vincent Rabaud"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules libeigen sensor-msgs tf2 tf2-ros libeigen"

RDEPENDS_${PN} = "python-orocos-kdl rospy"

SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/melodic/tf2_sensor_msgs/0.6.5-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c303f75f86cfee3cf694fba613935ee5"
SRC_URI[sha256sum] = "1a5247c2cfec650cb26758f587e6af12e90b0a99749eb861813ab39f83c7b2e6"

ROS_SPN = "geometry2"
S = "${WORKDIR}/geometry2-release-release-melodic-tf2_sensor_msgs-0.6.5-0"

inherit catkin
