DESCRIPTION = "ROS message definitions for Velodyne 3D LIDARs."
AUTHOR = "Jack O'Quin"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ros-drivers-gbp/velodyne-release/archive/release/melodic/velodyne_msgs/1.5.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b9f8a0520fbaaa83e9a693712012223c"
SRC_URI[sha256sum] = "59f623187d275f018300f623402c97eb9ce5dd06d0c95936d5d63916ccabb168"

ROS_SPN = "velodyne"
S = "${WORKDIR}/velodyne-release-release-melodic-velodyne_msgs-1.5.2-0"

inherit catkin
