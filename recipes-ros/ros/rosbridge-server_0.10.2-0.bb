DESCRIPTION = "A WebSocket interface to rosbridge."
AUTHOR = "Jonathan Mace"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = " python-tornado python-twisted-core rosbridge-library rosapi rospy rosauth"

SRC_URI = "https://github.com/RobotWebTools-release/rosbridge_suite-release/archive/release/melodic/rosbridge_server/0.10.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bf8135bc38d5d200279ec1eab6c6fb73"
SRC_URI[sha256sum] = "5248842a4dbb94bb03090ba48db1aa56cb676d35499689992e5d7b178a0cabcd"

ROS_SPN = "rosbridge_suite"
S = "${WORKDIR}/rosbridge_suite-release-release-melodic-rosbridge_server-0.10.2-0"

inherit catkin
