DESCRIPTION = "multires_image"
AUTHOR = "Marc Alban"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libqt-dev libqt-opengl-dev cv-bridge geometry-msgs gps-common mapviz pluginlib roscpp swri-math-util swri-transform-util swri-yaml-util tf"

RDEPENDS_${PN} = "libqt-core libqt-opengl rospy"

SRC_URI = "https://github.com/swri-robotics-gbp/mapviz-release/archive/release/melodic/multires_image/1.2.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "96a0d455292d2773bd1ba7515979ebe5"
SRC_URI[sha256sum] = "ff18ebdd591e53604b81f703406af9fa9747a64ff46d8d069f164b06c6d8b880"

ROS_SPN = "mapviz"
S = "${WORKDIR}/mapviz-release-release-melodic-multires_image-1.2.0-1"

inherit catkin
