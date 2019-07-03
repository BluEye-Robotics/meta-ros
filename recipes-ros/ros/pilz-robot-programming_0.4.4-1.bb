DESCRIPTION = "An Easy to use API to execute standard industrial robot commands like Ptp, Lin, Circ and Sequence using Moveit."
AUTHOR = ""
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "rospy roslint moveit-commander tf rospy pilz-trajectory-generation pilz-msgs python-psutil tf-conversions"

RDEPENDS_${PN} = "moveit-commander tf rospy pilz-trajectory-generation pilz-msgs python-psutil tf-conversions"

SRC_URI = "https://github.com/PilzDE/pilz_industrial_motion-release/archive/release/melodic/pilz_robot_programming/0.4.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1f154b91840265e9dddf6dafb315aa39"
SRC_URI[sha256sum] = "5f1c84479ff48c553790d192422dad2271e73bd991ee3a3634671eec5ec73b86"

ROS_SPN = "pilz_industrial_motion"
S = "${WORKDIR}/pilz_industrial_motion-release-release-melodic-pilz_robot_programming-0.4.4-1"

inherit catkin
