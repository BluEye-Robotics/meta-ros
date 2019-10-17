DESCRIPTION = "rosping is the tool to send ICMP ECHO_REQUEST to network hosts where roscore is running, and send back to you as rostopic message."
AUTHOR = "Kei Okada"
SECTION = "devel"
LICENSE = "BSL-1.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d98785270c85a483b5697dfd09b5f41a"

DEPENDS = "mk rosbuild roscpp std-msgs rostest rosboost-cfg roscpp std-msgs"

RDEPENDS_${PN} = "roscpp std-msgs"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/rosping/2.1.13-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d312a8a13f0ae744b2ee6af7db13a61b"
SRC_URI[sha256sum] = "b472c70876d5ec0b35b98ad397bb82db99de60570b8d319a1b06d8ce1212c462"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-rosping-2.1.13-1"

inherit catkin
