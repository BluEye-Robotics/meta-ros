DESCRIPTION = "Base implementation for CANopen chains node with support for management services and diagnostics"
AUTHOR = "Mathias Lüdtke"
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "message-generation std-msgs canopen-master diagnostic-updater pluginlib roslib roscpp socketcan-interface std-srvs message-runtime"

RDEPENDS_${PN} = "message-runtime std-msgs"

SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/melodic/canopen_chain_node/0.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "57c5d5b7681ef37443eb0615dc362c94"
SRC_URI[sha256sum] = "38578e51fcb8c8cf7e3de40d3febe7e318244f107b56346a984c7e5fe1cf9639"

ROS_SPN = "ros_canopen"
S = "${WORKDIR}/ros_canopen-release-release-melodic-canopen_chain_node-0.8.0-0"

inherit catkin
