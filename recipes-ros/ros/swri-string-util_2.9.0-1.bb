DESCRIPTION = "swri_string_util"
AUTHOR = "Marc Alban"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_string_util/2.9.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9dde6c4347f3be1d8b2a1df10d2865b5"
SRC_URI[sha256sum] = "6f60bd88c4d021c759fc16f08497d00ac6c4c1c5b466a32920d8aecefc5a9368"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_string_util-2.9.0-1"

inherit catkin
