DESCRIPTION = "rosping is the tool to send ICMP ECHO_REQUEST to network hosts where roscore is running, and send back to you as rostopic message."
AUTHOR = "Kei Okada"
SECTION = "devel"
LICENSE = "BSL-1.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d98785270c85a483b5697dfd09b5f41a"

DEPENDS = "mk rosbuild roscpp std-msgs rostest rosboost-cfg roscpp std-msgs"

RDEPENDS_${PN} = "roscpp std-msgs"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/rosping/2.1.11-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b672505f3d0bb11f5a743324d555a2a0"
SRC_URI[sha256sum] = "3a791764a80f3b660e57428d8274ecf2b13fefbb7959080aa035f7f8d16a0b35"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-rosping-2.1.11-0"

inherit catkin
