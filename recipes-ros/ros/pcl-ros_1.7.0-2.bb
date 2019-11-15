DESCRIPTION = "PCL (Point Cloud Library) ROS interface stack. PCL-ROS is the preferred bridge for 3D applications involving n-D Point Clouds and 3D geometry processing in ROS."
AUTHOR = "Open Perception"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=20;endline=20;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules rosconsole roslib dynamic-reconfigure libeigen geometry-msgs message-filters nodelet nodelet-topic-tools pcl pcl-conversions pcl-msgs pluginlib rosbag roscpp sensor-msgs std-msgs tf tf2 tf2-eigen tf2-ros"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/perception_pcl-release/archive/release/melodic/pcl_ros/1.7.0-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "18331a7edc5849bc561fc767b154215a"
SRC_URI[sha256sum] = "ada9b2af2498d10817c956af471f2c36e6cb1a088a5daeb74188746b7177acd6"

ROS_SPN = "perception_pcl"
S = "${WORKDIR}/perception_pcl-release-release-melodic-pcl_ros-1.7.0-2"

inherit catkin
