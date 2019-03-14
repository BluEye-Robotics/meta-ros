DESCRIPTION = "laser_proc"
AUTHOR = "Chad Rockey"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp rosconsole sensor-msgs pluginlib nodelet roscpp rosconsole sensor-msgs pluginlib nodelet"

RDEPENDS_${PN} = "roscpp rosconsole sensor-msgs pluginlib nodelet"

SRC_URI = "https://github.com/ros-gbp/laser_proc-release/archive/release/melodic/laser_proc/0.1.5-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3f7ceafdf1a225ec7866d238a864c9f3"
SRC_URI[sha256sum] = "bd596ebcfc3016970ba1c6abcd0d8c550e9b96a19ec6ab23ec8f5f3bc0f3d7c5"

S = "${WORKDIR}/laser_proc-release-release-melodic-laser_proc-0.1.5-0"

inherit catkin
