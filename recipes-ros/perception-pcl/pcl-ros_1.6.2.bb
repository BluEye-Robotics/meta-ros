DESCRIPTION = "PCL (Point Cloud Library) ROS interface stack"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=20;endline=20;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "dynamic-reconfigure libeigen nodelet nodelet-topic-tools message-filters tf rosbag pcl pcl-conversions \
  pcl-msgs pluginlib rosbag roscpp sensor-msgs std-msgs tf tf2-eigen"

SRC_URI = "https://github.com/ros-perception/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "51a7f1d79ddd3a595ced6dc98e51a8c6"
SRC_URI[sha256sum] = "6afb1f2697c6a2f9ca815baabcf4e75c08c59a2955f130dffad35a33a9c27cd2"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "perception_pcl"
