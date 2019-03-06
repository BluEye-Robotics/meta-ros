DESCRIPTION = "Xacro is an XML macro language."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslint"

SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "e71e29d9ced839f4601ad50c84471756"
SRC_URI[sha256sum] = "279f294c79c17e881352a09d051378818449bc057ced8a4328b9a101c8d3600a"

inherit catkin
