DESCRIPTION = "A WebSocket interface to rosbridge."
AUTHOR = "Jonathan Mace"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = " python-tornado python-twisted-core rosbridge-library rosbridge-msgs rosapi rospy rosauth"

SRC_URI = "https://github.com/RobotWebTools-release/rosbridge_suite-release/archive/release/melodic/rosbridge_server/0.11.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c2f37edfff5394dd4909bcd03a1b93e7"
SRC_URI[sha256sum] = "a684e9312df285ca883597f446427e9c6955a790ada9b97f67c40e2ccc0cc5f8"

ROS_SPN = "rosbridge_suite"
S = "${WORKDIR}/rosbridge_suite-release-release-melodic-rosbridge_server-0.11.3-1"

inherit catkin
