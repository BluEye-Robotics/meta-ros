DESCRIPTION = "The robot_activity_tutorials package"
AUTHOR = "Maciej ZURAD"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslint roscpp std-srvs robot-activity"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/snt-robotics/robot_activity-release/archive/release/melodic/robot_activity_tutorials/0.1.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b2ced329663eff0191356893a131bc1b"
SRC_URI[sha256sum] = "8d4cb4eb59c9bbcb053aef3cd75652525a4f7276d424cc3600a4d0e443807fd2"

ROS_SPN = "robot_activity"
S = "${WORKDIR}/robot_activity-release-release-melodic-robot_activity_tutorials-0.1.1-0"

inherit catkin
