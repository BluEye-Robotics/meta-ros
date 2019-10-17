DESCRIPTION = "swri_string_util"
AUTHOR = "Marc Alban"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_string_util/2.10.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "03a0c05160cf8bc1140851bd9b2afbdc"
SRC_URI[sha256sum] = "2f57d2124997f42d4f99f0bf88c286b1a39d45d8d7a3bffaba7d5d288c565fa8"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_string_util-2.10.0-1"

inherit catkin
