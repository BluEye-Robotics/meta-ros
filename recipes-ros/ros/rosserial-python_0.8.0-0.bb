DESCRIPTION = "A Python-based implementation of the rosserial protocol."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy rosserial-msgs diagnostic-msgs python3-pyserial"

RDEPENDS_${PN} = "rospy rosserial-msgs diagnostic-msgs python3-pyserial"

SRC_URI = "https://github.com/ros-gbp/rosserial-release/archive/release/melodic/rosserial_python/0.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d2c6afb135553b4bad41651c49b995ca"
SRC_URI[sha256sum] = "dc7ee1151a0b5b2dea4b0987e98c0296b67bfc4addb31ae70e14f33e18dd02c2"

ROS_SPN = "rosserial"
S = "${WORKDIR}/rosserial-release-release-melodic-rosserial_python-0.8.0-0"

inherit catkin
