DESCRIPTION = "Filter which fuses angular velocities, accelerations, and (optionally) magnetic readings from a generic IMU device into an orientation. Based on code by Sebastian Madgwick, http://www. x-io. co. uk/node/8#open_source_ahrs_and_imu_algorithms."
AUTHOR = "Ivan Dryanovski"
SECTION = "devel"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "roscpp sensor-msgs geometry-msgs tf2 tf2-geometry-msgs tf2-ros nodelet pluginlib message-filters dynamic-reconfigure roscpp sensor-msgs geometry-msgs tf2 tf2-geometry-msgs tf2-ros nodelet pluginlib message-filters dynamic-reconfigure"

RDEPENDS_${PN} = "roscpp sensor-msgs geometry-msgs tf2 tf2-geometry-msgs tf2-ros nodelet pluginlib message-filters dynamic-reconfigure"

SRC_URI = "https://github.com/uos-gbp/imu_tools-release/archive/release/melodic/imu_filter_madgwick/1.2.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5b52923e934e96bf0622e36ef17dc0e1"
SRC_URI[sha256sum] = "3b80b8a778fb209b3b42dd515e4f0a02d0018b205bbf35cbe94c1486c79db0be"

ROS_SPN = "imu_tools"
S = "${WORKDIR}/imu_tools-release-release-melodic-imu_filter_madgwick-1.2.0-0"

inherit catkin
