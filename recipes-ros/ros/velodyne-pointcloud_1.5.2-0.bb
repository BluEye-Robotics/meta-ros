DESCRIPTION = "Point cloud conversions for Velodyne 3D LIDARs."
AUTHOR = "Jack O'Quin"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles nodelet pcl-conversions pcl-ros pluginlib roscpp roslib sensor-msgs tf velodyne-driver velodyne-msgs yaml-cpp dynamic-reconfigure"

RDEPENDS_${PN} = "velodyne-laserscan"

SRC_URI = "https://github.com/ros-drivers-gbp/velodyne-release/archive/release/melodic/velodyne_pointcloud/1.5.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a238a0a419542b67b32a65b045cadc35"
SRC_URI[sha256sum] = "4ba277761a8c63407bf615e2aae6edf06f70f5c0349717afa3fc8be4d828dc76"

ROS_SPN = "velodyne"
S = "${WORKDIR}/velodyne-release-release-melodic-velodyne_pointcloud-1.5.2-0"

inherit catkin
