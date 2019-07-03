DESCRIPTION = "A WebSocket interface to rosbridge."
AUTHOR = "Jonathan Mace"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = " python-tornado python-twisted-core rosbridge-library rosbridge-msgs rosapi rospy rosauth"

SRC_URI = "https://github.com/RobotWebTools-release/rosbridge_suite-release/archive/release/melodic/rosbridge_server/0.11.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2acb65608b68250821e8df6ed8bea450"
SRC_URI[sha256sum] = "b83363be88585990009d1fe2c35886f6123fcdbaa196729cc44e80555b510bd9"

ROS_SPN = "rosbridge_suite"
S = "${WORKDIR}/rosbridge_suite-release-release-melodic-rosbridge_server-0.11.1-1"

inherit catkin
