DESCRIPTION = "segmentation"
AUTHOR = "Tony Zhang"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "angles nodelet pcl-conversions pcl-ros pluginlib roscpp roslib sensor-msgs tf dynamic-reconfigure roslaunch rostest tf2-ros message-generation rospy std-msgs pcl-conversions pcl-ros pcl rslidar-msgs diagnostic-updater libpcap angles pcl-ros nodelet pluginlib roscpp roslib rospy sensor-msgs tf dynamic-reconfigure message-runtime pcl-conversions pcl-ros libpcl-all std-msgs rslidar-msgs diagnostic-updater"

RDEPENDS_${PN} = "angles pcl-ros nodelet pluginlib roscpp roslib rospy sensor-msgs tf dynamic-reconfigure message-runtime pcl-conversions pcl-ros libpcl-all std-msgs rslidar-msgs diagnostic-updater"

SRC_URI = "https://github.com/CPFL/robosense-release/archive/release/melodic/rslidar_driver/1.0.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "42d0451f4f328948eebde098a8cea5cb"
SRC_URI[sha256sum] = "7f1ae8931ebeb64b13cf0b1976fb269a63257de51d8de79c6cebbd716a307661"

ROS_SPN = "robosense"
S = "${WORKDIR}/robosense-release-release-melodic-rslidar_driver-1.0.2-0"

inherit catkin
