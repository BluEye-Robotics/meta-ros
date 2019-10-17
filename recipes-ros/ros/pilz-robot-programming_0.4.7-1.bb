DESCRIPTION = "An Easy to use API to execute standard industrial robot commands like Ptp, Lin, Circ and Sequence using Moveit."
AUTHOR = ""
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "rospy roslint moveit-commander tf rospy pilz-trajectory-generation pilz-msgs python3-psutil tf-conversions"

RDEPENDS_${PN} = "moveit-commander tf rospy pilz-trajectory-generation pilz-msgs python3-psutil tf-conversions"

SRC_URI = "https://github.com/PilzDE/pilz_industrial_motion-release/archive/release/melodic/pilz_robot_programming/0.4.7-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5d395e8629ea9ce6995b0305e3efcd5c"
SRC_URI[sha256sum] = "6f6571ca11129efd57d8035771d53ef9609f51f2f840c4dba2c761be788733dd"

ROS_SPN = "pilz_industrial_motion"
S = "${WORKDIR}/pilz_industrial_motion-release-release-melodic-pilz_robot_programming-0.4.7-1"

inherit catkin
