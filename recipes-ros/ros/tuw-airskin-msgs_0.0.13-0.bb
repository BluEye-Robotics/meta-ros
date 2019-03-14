DESCRIPTION = "The tuw_airskin_msgs package"
AUTHOR = "Klaus Buchegger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "std-msgs geometry-msgs message-generation"

RDEPENDS_${PN} = "std-msgs geometry-msgs message-runtime"

SRC_URI = "https://github.com/tuw-robotics/tuw_msgs-release/archive/release/melodic/tuw_airskin_msgs/0.0.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2f046c3e282222f1c288f6dcf4525409"
SRC_URI[sha256sum] = "86882acd5c73168422e7ed6be2d10f89d9c5f1bd07951be9479eaf10fa9a082d"

ROS_SPN = "tuw_msgs"
S = "${WORKDIR}/tuw_msgs-release-release-melodic-tuw_airskin_msgs-0.0.13-0"

inherit catkin
