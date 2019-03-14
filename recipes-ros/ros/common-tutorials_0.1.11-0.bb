DESCRIPTION = "Metapackage that contains common tutorials"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-tutorials nodelet-tutorial-math pluginlib-tutorials turtle-actionlib"

RDEPENDS_${PN} = "actionlib-tutorials nodelet-tutorial-math pluginlib-tutorials turtle-actionlib"

SRC_URI = "https://github.com/ros-gbp/common_tutorials-release/archive/release/melodic/common_tutorials/0.1.11-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bc0b096091f388b85f85932644d6ec75"
SRC_URI[sha256sum] = "a74b72d318a6002dcee5e39472587f5fbe70741e93e71fac242b4ad60b78d9d0"

S = "${WORKDIR}/common_tutorials-release-release-melodic-common_tutorials-0.1.11-0"

inherit catkin
