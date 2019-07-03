DESCRIPTION = "Driver for the Phidgets Spatial 3/3/3 devices"
AUTHOR = "Ivan Dryanovski"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "diagnostic-msgs diagnostic-updater nodelet phidgets-api pluginlib roscpp roslaunch sensor-msgs std-msgs std-srvs tf diagnostic-aggregator diagnostic-msgs diagnostic-updater imu-filter-madgwick nodelet phidgets-api pluginlib roscpp sensor-msgs std-msgs std-srvs tf"

RDEPENDS_${PN} = "diagnostic-aggregator diagnostic-msgs diagnostic-updater imu-filter-madgwick nodelet phidgets-api pluginlib roscpp sensor-msgs std-msgs std-srvs tf"

SRC_URI = "https://github.com/ros-drivers-gbp/phidgets_drivers-release/archive/release/melodic/phidgets_imu/0.7.9-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "db8279f1344caee7f2fd4cb75b8f6df9"
SRC_URI[sha256sum] = "43c322e37f15a5ae31b5a0695c9243f134528a31e8ebefe92f6022eecd5d3fe5"

ROS_SPN = "phidgets_drivers"
S = "${WORKDIR}/phidgets_drivers-release-release-melodic-phidgets_imu-0.7.9-1"

inherit catkin
