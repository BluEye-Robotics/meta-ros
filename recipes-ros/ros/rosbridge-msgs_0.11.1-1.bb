DESCRIPTION = "Package containing message files"
AUTHOR = "Hans-Joachim Krauch"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs message-runtime"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/RobotWebTools-release/rosbridge_suite-release/archive/release/melodic/rosbridge_msgs/0.11.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1913f4da7f7ec545671621c75742d5d0"
SRC_URI[sha256sum] = "2c76b5cba7a842647144ed70ac6ca6dede85c0b08c6721836568f79d4807ef6c"

ROS_SPN = "rosbridge_suite"
S = "${WORKDIR}/rosbridge_suite-release-release-melodic-rosbridge_msgs-0.11.1-1"

inherit catkin
