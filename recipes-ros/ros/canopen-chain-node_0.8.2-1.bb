DESCRIPTION = "Base implementation for CANopen chains node with support for management services and diagnostics"
AUTHOR = "Mathias Lüdtke"
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "message-generation std-msgs canopen-master diagnostic-updater pluginlib rosconsole-bridge roscpp roslib socketcan-interface std-srvs message-runtime"

RDEPENDS_${PN} = "message-runtime std-msgs"

SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/melodic/canopen_chain_node/0.8.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e2d691625eb5423b95158e01908c2e44"
SRC_URI[sha256sum] = "cfe86ad277238bab8a585f6a337c8abe1607e0493b3d20e6305a2d522a381616"

ROS_SPN = "ros_canopen"
S = "${WORKDIR}/ros_canopen-release-release-melodic-canopen_chain_node-0.8.2-1"

inherit catkin
