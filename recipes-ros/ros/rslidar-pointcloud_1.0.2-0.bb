DESCRIPTION = "Point cloud conversions for rslidar 3D LIDARs."
AUTHOR = "Tony Zhang"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "angles nodelet pcl-conversions pcl-ros pluginlib roscpp roslib sensor-msgs tf rslidar-driver rslidar-msgs dynamic-reconfigure roslaunch rostest tf2-ros angles nodelet pcl-ros pluginlib roscpp roslib sensor-msgs tf rslidar-driver rslidar-msgs dynamic-reconfigure"

RDEPENDS_${PN} = "angles nodelet pcl-ros pluginlib roscpp roslib sensor-msgs tf rslidar-driver rslidar-msgs dynamic-reconfigure"

SRC_URI = "https://github.com/CPFL/robosense-release/archive/release/melodic/rslidar_pointcloud/1.0.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fd83a3427cb5ad730d031cd9419efc11"
SRC_URI[sha256sum] = "a6c848ebbe5c69d8458345fbb9c5fd54012a1a96130c1587ccf0b251de64aa75"

ROS_SPN = "robosense"
S = "${WORKDIR}/robosense-release-release-melodic-rslidar_pointcloud-1.0.2-0"

inherit catkin
