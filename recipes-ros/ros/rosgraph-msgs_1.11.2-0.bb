DESCRIPTION = "Messages relating to the ROS Computation Graph. These are generally considered to be low-level messages that end users do not interact with."
AUTHOR = "Ken Conley"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs message-runtime std-msgs"

RDEPENDS_${PN} = "message-runtime std-msgs"

SRC_URI = "https://github.com/ros-gbp/ros_comm_msgs-release/archive/release/melodic/rosgraph_msgs/1.11.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1385b903a4046da68a47991444d3e752"
SRC_URI[sha256sum] = "5aa9e1b1adbf5e86931e771b1a154384485803a73e50804e0c739f83767270c9"

ROS_SPN = "ros_comm_msgs"
S = "${WORKDIR}/ros_comm_msgs-release-release-melodic-rosgraph_msgs-1.11.2-0"

inherit catkin
