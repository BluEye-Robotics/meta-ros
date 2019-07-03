DESCRIPTION = "The cnn_bridge package take freeze graphs and publishes them as ROS messages"
AUTHOR = "Noam C. Golombek"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation rospy roslib std-msgs geometry-msgs message-generation rospy"

RDEPENDS_${PN} = "rospy roslaunch message-runtime roslaunch std-msgs geometry-msgs roslib"

SRC_URI = "https://github.com/wew84/cnn_bridge-release/archive/release/melodic/cnn_bridge/0.8.5-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "554a12675441cb185464a2b21c94259f"
SRC_URI[sha256sum] = "e1a18db4221ed9d52b21a85d68846cac16a5790d53355380d3552e0145eb691f"

S = "${WORKDIR}/cnn_bridge-release-release-melodic-cnn_bridge-0.8.5-1"

inherit catkin
