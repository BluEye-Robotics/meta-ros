DESCRIPTION = "Messages for fetch_auto_dock package"
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation actionlib actionlib-msgs geometry-msgs message-runtime"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_msgs-release/archive/release/melodic/fetch_auto_dock_msgs/1.1.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "97f5f48e40a2e892ffac9c2de9a4074b"
SRC_URI[sha256sum] = "34f30fe803b0fad0edc3a7983308c34404592920ce11fbdd0d96fd8ea849eb77"

ROS_SPN = "fetch_msgs"
S = "${WORKDIR}/fetch_msgs-release-release-melodic-fetch_auto_dock_msgs-1.1.1-0"

inherit catkin
