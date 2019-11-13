DESCRIPTION = "Package containing message files"
AUTHOR = "Hans-Joachim Krauch"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs message-runtime"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/RobotWebTools-release/rosbridge_suite-release/archive/release/melodic/rosbridge_msgs/0.11.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a02a9d3a32a453fe1c6b6ae436ff26eb"
SRC_URI[sha256sum] = "04bed1531b62ac7ee3e3ef8bdb39469e22d6422c805a0db6bce0eff7527042db"

ROS_SPN = "rosbridge_suite"
S = "${WORKDIR}/rosbridge_suite-release-release-melodic-rosbridge_msgs-0.11.3-1"

inherit catkin
