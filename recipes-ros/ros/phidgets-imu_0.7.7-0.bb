DESCRIPTION = "Driver for the Phidgets Spatial 3/3/3 devices"
AUTHOR = "Ivan Dryanovski"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "diagnostic-msgs diagnostic-updater nodelet phidgets-api pluginlib roscpp roslaunch sensor-msgs std-msgs std-srvs tf diagnostic-aggregator diagnostic-msgs diagnostic-updater imu-filter-madgwick nodelet phidgets-api pluginlib roscpp sensor-msgs std-msgs std-srvs tf"

RDEPENDS_${PN} = "diagnostic-aggregator diagnostic-msgs diagnostic-updater imu-filter-madgwick nodelet phidgets-api pluginlib roscpp sensor-msgs std-msgs std-srvs tf"

SRC_URI = "https://github.com/ros-drivers-gbp/phidgets_drivers-release/archive/release/melodic/phidgets_imu/0.7.7-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4359e2c3d40146af6459262bf31820c1"
SRC_URI[sha256sum] = "65ebf60e6f3b3113b73e67b86b44184e8157dd2b33a3a9ced64765641a1a32df"

ROS_SPN = "phidgets_drivers"
S = "${WORKDIR}/phidgets_drivers-release-release-melodic-phidgets_imu-0.7.7-0"

inherit catkin
