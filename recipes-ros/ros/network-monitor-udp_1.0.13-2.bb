DESCRIPTION = "Facilities to monitor a network connection by sending UDP packets from a client to a server, which bounces them back to the client. The client collects statistics on latency and loss. The server is a C standalone utility or a ROS node. The client can be a ROS node, a standalone utility or a python class."
AUTHOR = "Blaise Gassend"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy diagnostic-msgs actionlib-msgs actionlib message-generation message-runtime rospy diagnostic-msgs actionlib-msgs actionlib"

RDEPENDS_${PN} = "message-runtime rospy diagnostic-msgs actionlib-msgs actionlib"

SRC_URI = "https://github.com/pr2-gbp/linux_networking-release/archive/release/melodic/network_monitor_udp/1.0.13-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "806af2d02853d4fc659bff79cd9f4d0e"
SRC_URI[sha256sum] = "d203956bc49ba42bf2f54ef0cb57253ec42fd8278260bd5090fd998765198154"

ROS_SPN = "linux_networking"
S = "${WORKDIR}/linux_networking-release-release-melodic-network_monitor_udp-1.0.13-2"

inherit catkin
