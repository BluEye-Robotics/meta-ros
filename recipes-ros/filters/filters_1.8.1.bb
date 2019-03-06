DESCRIPTION = "This library provides a standardized interface for processing data as a sequence of filters."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslib rosconsole roscpp pluginlib"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9db24104f8696cf89d5dd8c47cd390db"
SRC_URI[sha256sum] = "647958f9eba1cb304fe0e7899c3ee884b3b748720a41afb1c509ac8badf610c2"

inherit catkin
