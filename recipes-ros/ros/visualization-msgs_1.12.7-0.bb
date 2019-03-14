DESCRIPTION = "visualization_msgs is a set of messages used by higher level packages, such as"
AUTHOR = "Josh Faust"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs message-generation std-msgs geometry-msgs message-runtime std-msgs"

RDEPENDS_${PN} = "geometry-msgs message-runtime std-msgs"

SRC_URI = "https://github.com/ros-gbp/common_msgs-release/archive/release/melodic/visualization_msgs/1.12.7-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1f1bf26edf660c8b32b68789e771a93c"
SRC_URI[sha256sum] = "fcd899da639e6bd69f2b1dab627bf76ae527ae753f671d01357cb55c215d05da"

ROS_SPN = "common_msgs"
S = "${WORKDIR}/common_msgs-release-release-melodic-visualization_msgs-1.12.7-0"

inherit catkin
