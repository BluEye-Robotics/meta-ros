DESCRIPTION = "Package containing messages for Ibeo sensors."
AUTHOR = "Joshua Whitley"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "message-generation std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/astuff/astuff_sensor_msgs-release/archive/release/melodic/ibeo_msgs/2.3.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3319880bf4414e734968122e0fb5af8c"
SRC_URI[sha256sum] = "dea8e5394662faf24cdc6a29a2d03de48952bf5000498f87110a5735c413e2f2"

ROS_SPN = "astuff_sensor_msgs"
S = "${WORKDIR}/astuff_sensor_msgs-release-release-melodic-ibeo_msgs-2.3.1-0"

inherit catkin
