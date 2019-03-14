DESCRIPTION = "Filter which fuses angular velocities, accelerations, and (optionally) magnetic readings from a generic IMU device into a quaternion to represent the orientation of the device wrt the global frame. Based on the algorithm by Roberto G. Valenti etal. described in the paper "Keeping a Good Attitude: A Quaternion-Based Orientation Filter for IMUs and MARGs" available at http://www. mdpi. com/1424-8220/15/8/19302 ."
AUTHOR = "Roberto G. Valenti"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules message-filters roscpp sensor-msgs std-msgs tf message-filters roscpp sensor-msgs std-msgs tf"

RDEPENDS_${PN} = "message-filters roscpp sensor-msgs std-msgs tf"

SRC_URI = "https://github.com/uos-gbp/imu_tools-release/archive/release/melodic/imu_complementary_filter/1.2.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "61787e814a8fdaa5b04212d2e04680b1"
SRC_URI[sha256sum] = "c23c27697af1b9f37cc30cde2c65855eadd20cf0faa3264b2dfeaeeb54a915da"

ROS_SPN = "imu_tools"
S = "${WORKDIR}/imu_tools-release-release-melodic-imu_complementary_filter-1.2.0-0"

inherit catkin
