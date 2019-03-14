DESCRIPTION = "rosserial for the VEX Cortex V5 Robot Brain platform."
AUTHOR = "Cannon"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy rosserial-client rosserial-python"

RDEPENDS_${PN} = "rospy rosserial-client rosserial-python"

SRC_URI = "https://github.com/ros-gbp/rosserial-release/archive/release/melodic/rosserial_vex_v5/0.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b089ce2355ba1f8ebbe8c930ae5ff67b"
SRC_URI[sha256sum] = "4f28ad67afe3ee95fc74913159fcf5c1121049490b7ab7cb95721ccd04122c80"

ROS_SPN = "rosserial"
S = "${WORKDIR}/rosserial-release-release-melodic-rosserial_vex_v5-0.8.0-0"

inherit catkin
