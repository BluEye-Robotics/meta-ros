DESCRIPTION = "swri_system_util"
AUTHOR = "Marc Alban"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_system_util/2.9.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5e0c101c690127a6d6f27a9eeb710b1b"
SRC_URI[sha256sum] = "4d61a4d1d76cb4a3df482c3c481299838442e7fc1cd2ea812aafbf0fdecc28e2"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_system_util-2.9.0-1"

inherit catkin
