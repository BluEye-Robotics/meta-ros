DESCRIPTION = "Nodelet Core Metapackage"
AUTHOR = "Tully Foote"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "nodelet nodelet-topic-tools"

SRC_URI = "https://github.com/ros-gbp/nodelet_core-release/archive/release/melodic/nodelet_core/1.9.16-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9241f052bcb640f77f3f896feea6ce58"
SRC_URI[sha256sum] = "a0537935c5c1b091cf655f0a31852d72ec54b245b2577d139cd66d33332eea9b"

S = "${WORKDIR}/nodelet_core-release-release-melodic-nodelet_core-1.9.16-0"

inherit catkin
