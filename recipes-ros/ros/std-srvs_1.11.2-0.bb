DESCRIPTION = "Common service definitions."
AUTHOR = "Morgan Quigley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation message-runtime"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ros-gbp/ros_comm_msgs-release/archive/release/melodic/std_srvs/1.11.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "68b9d69abc0d43f18a0823c8c03f7dc1"
SRC_URI[sha256sum] = "ecc565aebf13d5afbfaf42a1fb8a31de29af19331ca76239ced87c10f14fc363"

ROS_SPN = "ros_comm_msgs"
S = "${WORKDIR}/ros_comm_msgs-release-release-melodic-std_srvs-1.11.2-0"

inherit catkin
