DESCRIPTION = "C++ ROS message and service generators."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "genmsg"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "53b5bd4bab1260a8807c0dc6e687dcb8"
SRC_URI[sha256sum] = "8d703c4b6595c248035fa9b7e667b67c3fcb2cfddaa408bc63193ff52fd7b2c5"

inherit catkin
