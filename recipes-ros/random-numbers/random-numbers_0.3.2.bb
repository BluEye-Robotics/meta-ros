DESCRIPTION = "This library contains wrappers for generating floating point values, integers, quaternions using boost libraries."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost"

SRC_URI = "https://github.com/ros-planning/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "0fd6c6503ef969307e91fa25fabd8b02"
SRC_URI[sha256sum] = "da825a0c7a4e9de180d9d539aa78682c1d805b1e4c3ef16af0e6cb384f2134f5"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
