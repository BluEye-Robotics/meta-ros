DESCRIPTION = "Facilities to monitor a network connection by sending UDP packets from a client to a server, which bounces them back to the client. The client collects statistics on latency and loss. The server is a C standalone utility or a ROS node. The client can be a ROS node, a standalone utility or a python class."
AUTHOR = "Blaise Gassend"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy diagnostic-msgs actionlib-msgs actionlib message-generation message-runtime rospy diagnostic-msgs actionlib-msgs actionlib"

RDEPENDS_${PN} = "message-runtime rospy diagnostic-msgs actionlib-msgs actionlib"

SRC_URI = "https://github.com/pr2-gbp/linux_networking-release/archive/release/melodic/network_monitor_udp/1.0.16-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "924c742ab6c424dd351121396afe3935"
SRC_URI[sha256sum] = "6d2e8f5054923d181f20ddee18fe669fefa9bafbc3e39edf2ed77d1b629a5ea4"

ROS_SPN = "linux_networking"
S = "${WORKDIR}/linux_networking-release-release-melodic-network_monitor_udp-1.0.16-1"

inherit catkin
