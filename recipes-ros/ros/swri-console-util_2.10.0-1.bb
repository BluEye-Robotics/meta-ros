DESCRIPTION = "swri_console_util"
AUTHOR = "Marc Alban"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp swri-math-util"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_console_util/2.10.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9852aa054873124495304f981b0f99db"
SRC_URI[sha256sum] = "cbf23d0a6e2d646c5f7db99ce0b60c2e774a0cf9247a879a3cd3a1128b3e65fb"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_console_util-2.10.0-1"

inherit catkin
