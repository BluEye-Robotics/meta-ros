DESCRIPTION = "An Easy to use API to execute standard industrial robot commands like Ptp, Lin, Circ and Sequence using Moveit."
AUTHOR = ""
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "rospy roslint moveit-commander tf rospy pilz-trajectory-generation pilz-msgs python-psutil tf-conversions"

RDEPENDS_${PN} = "moveit-commander tf rospy pilz-trajectory-generation pilz-msgs python-psutil tf-conversions"

SRC_URI = "https://github.com/PilzDE/pilz_industrial_motion-release/archive/release/melodic/pilz_robot_programming/0.4.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "878c975d9123c66d3a3ce68933506c9b"
SRC_URI[sha256sum] = "20e7ecd7da757de097a42fdeebbd98ccfb92b891297ce982a104250d66d7573b"

ROS_SPN = "pilz_industrial_motion"
S = "${WORKDIR}/pilz_industrial_motion-release-release-melodic-pilz_robot_programming-0.4.2-0"

inherit catkin
