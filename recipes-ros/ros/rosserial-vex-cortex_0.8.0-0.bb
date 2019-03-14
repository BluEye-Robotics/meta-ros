DESCRIPTION = "rosserial for Cortex/AVR platforms."
AUTHOR = "Cannon"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy rosserial-client rosserial-python"

RDEPENDS_${PN} = "rospy rosserial-client rosserial-python"

SRC_URI = "https://github.com/ros-gbp/rosserial-release/archive/release/melodic/rosserial_vex_cortex/0.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "12cfef8b4b8d80e7cbb2ebbe4cb70ed0"
SRC_URI[sha256sum] = "d043417c13c7692d528e3382813c00bdd9a6da7a5dc7ea0e5da6e68e44c395c4"

ROS_SPN = "rosserial"
S = "${WORKDIR}/rosserial-release-release-melodic-rosserial_vex_cortex-0.8.0-0"

inherit catkin
