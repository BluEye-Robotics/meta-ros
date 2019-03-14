DESCRIPTION = "multires_image"
AUTHOR = "Marc Alban"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libqt-dev libqt-opengl-dev cv-bridge gps-common mapviz pluginlib roscpp swri-math-util swri-transform-util swri-yaml-util tf"

RDEPENDS_${PN} = "libqt-core libqt-opengl rospy"

SRC_URI = "https://github.com/swri-robotics-gbp/mapviz-release/archive/release/melodic/multires_image/1.1.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "dc7cfabd11b879fe01c4f011324493eb"
SRC_URI[sha256sum] = "f7c8afa9753d8b540f5b10af86adecf209bec63d12f99370da58b373cecd8f59"

ROS_SPN = "mapviz"
S = "${WORKDIR}/mapviz-release-release-melodic-multires_image-1.1.0-0"

inherit catkin
