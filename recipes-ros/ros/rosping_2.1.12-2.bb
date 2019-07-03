DESCRIPTION = "rosping is the tool to send ICMP ECHO_REQUEST to network hosts where roscore is running, and send back to you as rostopic message."
AUTHOR = "Kei Okada"
SECTION = "devel"
LICENSE = "BSL-1.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d98785270c85a483b5697dfd09b5f41a"

DEPENDS = "mk rosbuild roscpp std-msgs rostest rosboost-cfg roscpp std-msgs"

RDEPENDS_${PN} = "roscpp std-msgs"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/rosping/2.1.12-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "01b647d9e18f9f5322653d82bb32b67e"
SRC_URI[sha256sum] = "47ebb8800b5f9364664c8398d385b124d715f4458c1eb9bd27b837df9f4d6bd8"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-rosping-2.1.12-2"

inherit catkin
