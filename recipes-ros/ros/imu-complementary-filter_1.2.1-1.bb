DESCRIPTION = "Filter which fuses angular velocities, accelerations, and (optionally) magnetic readings from a generic IMU device into a quaternion to represent the orientation of the device wrt the global frame. Based on the algorithm by Roberto G. Valenti etal. described in the paper "Keeping a Good Attitude: A Quaternion-Based Orientation Filter for IMUs and MARGs" available at http://www. mdpi. com/1424-8220/15/8/19302 ."
AUTHOR = "Roberto G. Valenti"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules message-filters roscpp sensor-msgs std-msgs tf message-filters roscpp sensor-msgs std-msgs tf"

RDEPENDS_${PN} = "message-filters roscpp sensor-msgs std-msgs tf"

SRC_URI = "https://github.com/uos-gbp/imu_tools-release/archive/release/melodic/imu_complementary_filter/1.2.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f808295e25d0c395d35c8e2a0cafc6cc"
SRC_URI[sha256sum] = "a039e20b6d977288ca1672bb3a48cca17ee24935e497174cacea40a94f04ecb5"

ROS_SPN = "imu_tools"
S = "${WORKDIR}/imu_tools-release-release-melodic-imu_complementary_filter-1.2.1-1"

inherit catkin
