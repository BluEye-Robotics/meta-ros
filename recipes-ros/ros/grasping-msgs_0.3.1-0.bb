DESCRIPTION = "Messages for describing objects and how to grasp them."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib geometry-msgs message-generation moveit-msgs sensor-msgs shape-msgs actionlib geometry-msgs message-runtime moveit-msgs sensor-msgs shape-msgs"

RDEPENDS_${PN} = "actionlib geometry-msgs message-runtime moveit-msgs sensor-msgs shape-msgs"

SRC_URI = "https://github.com/mikeferguson/grasping_msgs-gbp/archive/release/melodic/grasping_msgs/0.3.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0b6ac8dd3f0d00f26a0177e105f01f51"
SRC_URI[sha256sum] = "1deeb71cb90294e0027a324105670add8ffd4dabbcd454cc4d2b9508f4fe89af"

S = "${WORKDIR}/grasping_msgs-gbp-release-melodic-grasping_msgs-0.3.1-0"

inherit catkin
