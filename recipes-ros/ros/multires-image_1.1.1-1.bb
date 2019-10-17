DESCRIPTION = "multires_image"
AUTHOR = "Marc Alban"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libqt-dev libqt-opengl-dev cv-bridge gps-common mapviz pluginlib roscpp swri-math-util swri-transform-util swri-yaml-util tf"

RDEPENDS_${PN} = "libqt-core libqt-opengl rospy"

SRC_URI = "https://github.com/swri-robotics-gbp/mapviz-release/archive/release/melodic/multires_image/1.1.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "788c0ddd8ea657ff07b6afe435c70c9c"
SRC_URI[sha256sum] = "6c3f107522a4f0dc0711b57c5e95d5f0b1956de5f670a42cbe5362583f8f6407"

ROS_SPN = "mapviz"
S = "${WORKDIR}/mapviz-release-release-melodic-multires_image-1.1.1-1"

inherit catkin
