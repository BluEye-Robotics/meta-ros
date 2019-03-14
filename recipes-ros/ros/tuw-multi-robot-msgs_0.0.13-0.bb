DESCRIPTION = "The tuw_multi_robot_msgs package contains messages for sending graph, route and sync data over topics."
AUTHOR = "Benjamin Binder"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs message-generation nav-msgs std-msgs"

RDEPENDS_${PN} = "geometry-msgs nav-msgs std-msgs message-runtime"

SRC_URI = "https://github.com/tuw-robotics/tuw_msgs-release/archive/release/melodic/tuw_multi_robot_msgs/0.0.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "454c9dcec025033e3299bdb147881ea9"
SRC_URI[sha256sum] = "c46ab49af256d3f580c7eade0281686d12dfa70472080d9c6b4a6c9c3e153f43"

ROS_SPN = "tuw_msgs"
S = "${WORKDIR}/tuw_msgs-release-release-melodic-tuw_multi_robot_msgs-0.0.13-0"

inherit catkin
