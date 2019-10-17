DESCRIPTION = "Base implementation for CANopen chains node with support for management services and diagnostics"
AUTHOR = "Mathias Lüdtke"
SECTION = "devel"
LICENSE = "LGPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "message-generation std-msgs canopen-master diagnostic-updater pluginlib roslib roscpp socketcan-interface std-srvs message-runtime"

RDEPENDS_${PN} = "message-runtime std-msgs"

SRC_URI = "https://github.com/ros-industrial-release/ros_canopen-release/archive/release/melodic/canopen_chain_node/0.8.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "20bef64b7092302c455a3074aa029aa9"
SRC_URI[sha256sum] = "e4130c5d434ce1e83c9b36b6db756acc56523b7ec10187195cdc9bd41744caef"

ROS_SPN = "ros_canopen"
S = "${WORKDIR}/ros_canopen-release-release-melodic-canopen_chain_node-0.8.1-1"

inherit catkin
