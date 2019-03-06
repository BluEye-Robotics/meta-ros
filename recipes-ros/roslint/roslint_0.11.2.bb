DESCRIPTION = "CMake lint commands for ROS packages"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "658a9a4a6dade5d11674878fe1a7d447"
SRC_URI[sha256sum] = "e86b12ddf03cf1530b3343df797e381bcb8214004c992b7ac280918fd70672f0"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin

RDEPENDS_${PN} += "bash"
