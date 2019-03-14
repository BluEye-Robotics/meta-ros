DESCRIPTION = "nav_msgs defines the common messages used to interact with the"
AUTHOR = "Tully Foote"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs message-generation std-msgs actionlib-msgs geometry-msgs message-runtime std-msgs actionlib-msgs"

RDEPENDS_${PN} = "geometry-msgs message-runtime std-msgs actionlib-msgs"

SRC_URI = "https://github.com/ros-gbp/common_msgs-release/archive/release/melodic/nav_msgs/1.12.7-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f10c6865946ce1fdd60f2daf08e0029b"
SRC_URI[sha256sum] = "614b3c69348013d8d3fc72c67652ad3b02057376044e63a29210261be1406eac"

ROS_SPN = "common_msgs"
S = "${WORKDIR}/common_msgs-release-release-melodic-nav_msgs-1.12.7-0"

inherit catkin
