DESCRIPTION = "System-wide logging mechanism for messages sent to the /rosout topic."
AUTHOR = "Josh Faust"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp rosgraph-msgs roscpp rosgraph-msgs"

RDEPENDS_${PN} = "roscpp rosgraph-msgs"

SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/melodic/rosout/1.14.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9f22ce19be00043db41a178993ed81ca"
SRC_URI[sha256sum] = "3699399910840cdbd100ffa9f27e0ef478f516c1d3409c7f62d6af8e3ca59cc6"

ROS_SPN = "ros_comm"
S = "${WORKDIR}/ros_comm-release-release-melodic-rosout-1.14.3-0"

inherit catkin
